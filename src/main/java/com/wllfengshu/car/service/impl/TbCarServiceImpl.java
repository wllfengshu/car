package com.wllfengshu.car.service.impl;

import com.wllfengshu.car.dao.TbCarDAO;
import com.wllfengshu.car.entity.TbCarEntity;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.service.TbCarService;
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
public class TbCarServiceImpl implements TbCarService {

    @NonNull
    private TbCarDAO tbCarDAO;

    @Override
    public Map<String, Object> insert(TbCarEntity entity, String sessionId) throws CustomException {
        log.info("insert entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCarDAO.insertSelective(entity);
        return result;
    }

    @Override
    public Map<String, Object> delete(Integer id, String sessionId) throws CustomException {
        log.info("delete id:{}", id);
        Map<String, Object> result = new HashMap<>();
        tbCarDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public Map<String, Object> update(TbCarEntity entity, String sessionId) throws CustomException {
        log.info("update entity:{}", entity);
        Map<String, Object> result = new HashMap<>();
        tbCarDAO.updateByPrimaryKey(entity);
        return result;
    }

    @Override
    public Map<String, Object> select(Integer id, String sessionId) throws CustomException {
        log.info("select id:{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("data", tbCarDAO.selectByPrimaryKey(id));
        return result;
    }

    @Override
    public Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException {
        log.info("selects params:{}", params);
        Map<String, Object> result = new HashMap<>();
        return result;
    }

}
