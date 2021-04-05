package com.wllfengshu.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.wllfengshu.car.auth.Auth;
import com.wllfengshu.car.dao.TbFaultReasonDictDAO;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.model.entity.TbFaultReasonDictEntity;
import com.wllfengshu.car.service.TbFaultReasonDictService;
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
public class TbFaultReasonDictServiceImpl implements TbFaultReasonDictService {

    @NonNull
    private TbFaultReasonDictDAO tbFaultReasonDictDAO;

    @Auth
    @Override
    public Map<String, Object> insert(TbFaultReasonDictEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbFaultReasonDictDAO.insertSelective(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbFaultReasonDictDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> update(TbFaultReasonDictEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbFaultReasonDictDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("data", tbFaultReasonDictDAO.selectByPrimaryKey(id));
        return result;
    }

    @Auth
    @Override
    public Map<String, Object> selects(Map<String, Object> params, Integer pageNo, Integer pageSize, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        PageHelper.startPage(pageNo, pageSize);
        result.put("data", tbFaultReasonDictDAO.selectAll());
        return result;
    }

}
