package com.wllfengshu.car.service.impl;

import com.wllfengshu.car.dao.TbCustomerDAO;
import com.wllfengshu.car.model.entity.TbCustomerEntity;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.service.TbCustomerService;
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
public class TbCustomerServiceImpl implements TbCustomerService {

    @NonNull
    private TbCustomerDAO tbCustomerDAO;

    @Override
    public Map<String, Object> insert(TbCustomerEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCustomerDAO.insertSelective(entity);
        return result;
    }

    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbCustomerDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public Map<String, Object> update(TbCustomerEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCustomerDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("data", tbCustomerDAO.selectByPrimaryKey(id));
        return result;
    }

    @Override
    public Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        return result;
    }

}
