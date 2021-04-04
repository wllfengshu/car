package com.wllfengshu.car.service.impl;

import com.wllfengshu.car.dao.TbUserDAO;
import com.wllfengshu.car.entity.TbUserEntity;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.service.TbUserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class TbUserServiceImpl implements TbUserService {

    @NonNull
    private TbUserDAO tbUserDAO;

    @Override
    public Map<String, Object> insert(TbUserEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbUserDAO.insertSelective(entity);
        return result;
    }

    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbUserDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public Map<String, Object> update(TbUserEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbUserDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("data", tbUserDAO.selectByPrimaryKey(id));
        return result;
    }

    @Override
    public Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        return result;
    }

}
