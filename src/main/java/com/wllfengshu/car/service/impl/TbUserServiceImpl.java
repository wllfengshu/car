package com.wllfengshu.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.wllfengshu.car.auth.Auth;
import com.wllfengshu.car.dao.TbUserDAO;
import com.wllfengshu.car.model.dto.LoginDTO;
import com.wllfengshu.car.model.entity.TbUserEntity;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.model.vo.SessionVO;
import com.wllfengshu.car.security.LoggedUser;
import com.wllfengshu.car.service.TbUserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

/**
 * @author
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class TbUserServiceImpl implements TbUserService {

    @NonNull
    private TbUserDAO tbUserDAO;

    @Auth
    @Override
    public Map<String, Object> insert(TbUserEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        entity.setPassword(DigestUtils.md5Hex(entity.getPassword()));
        tbUserDAO.insertSelective(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbUserDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> update(TbUserEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbUserDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        TbUserEntity tbUserEntity = tbUserDAO.selectByPrimaryKey(id);
        tbUserEntity.setPassword(null);
        result.put("data", tbUserEntity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> selects(Map<String, Object> params, Integer pageNo, Integer pageSize, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        PageHelper.startPage(pageNo, pageSize);
        List<TbUserEntity> tbUserEntities = tbUserDAO.selectAll();
        tbUserEntities.forEach(i -> i.setPassword(null));
        result.put("data", tbUserEntities);
        return result;
    }

    @Override
    public Map<String, Object> login(LoginDTO loginDTO) throws CustomException {
        Map<String, Object> result = new HashMap<>();

        if (StringUtils.isEmpty(loginDTO.getLoginName())) {
            log.error("用户名或者密码不能为空！");
            throw new CustomException("用户名或者密码不能为空！", CustomException.ExceptionName.NOTNULL_USERNAME_OR_PASSWORD);
        }

        Example example = new Example(TbUserEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginName", loginDTO.getLoginName());
        criteria.andEqualTo("password", DigestUtils.md5Hex(loginDTO.getPassword()));

        List<TbUserEntity> tbUserEntities = tbUserDAO.selectByExample(example);
        if (tbUserEntities.isEmpty()) {
            log.error("用户名或者密码错误！");
            throw new CustomException("用户名或者密码错误！", CustomException.ExceptionName.INVALID_USERNAME_OR_PASSWORD);
        }

        SessionVO sessionVO = new SessionVO();
        sessionVO.setSessionId(UUID.randomUUID().toString());
        sessionVO.setCreateTime(new Date());

        LoggedUser.login(sessionVO);
        result.put("data", sessionVO);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> logout(String sessionId) throws CustomException {
        Map<String, Object> result = new HashMap<>();
        LoggedUser.logout(sessionId);
        result.put("operation", "success");
        return result;
    }
}
