package com.wllfengshu.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.wllfengshu.car.auth.Auth;
import com.wllfengshu.car.dao.TbCarRepairDAO;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.model.entity.TbCarRepairEntity;
import com.wllfengshu.car.service.TbCarRepairService;
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
public class TbCarRepairServiceImpl implements TbCarRepairService {

    @NonNull
    private TbCarRepairDAO tbCarRepairDAO;

    @Auth
    @Override
    public Map<String, Object> insert(TbCarRepairEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCarRepairDAO.insertSelective(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbCarRepairDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> update(TbCarRepairEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCarRepairDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("data", tbCarRepairDAO.selectByPrimaryKey(id));
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> selects(Map<String, Object> params, Integer pageNo, Integer pageSize, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        PageHelper.startPage(pageNo, pageSize);
        result.put("data", tbCarRepairDAO.selects(params));
        return result;
    }

}
