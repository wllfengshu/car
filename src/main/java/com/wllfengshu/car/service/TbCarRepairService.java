package com.wllfengshu.car.service;

import com.wllfengshu.car.entity.TbCarRepairEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbCarRepairService {

    Map<String, Object> insert(TbCarRepairEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbCarRepairEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException;

}
