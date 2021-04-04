package com.wllfengshu.car.service;

import com.wllfengshu.car.entity.TbFaultReasonDictEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbFaultReasonDictService {

    Map<String, Object> insert(TbFaultReasonDictEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbFaultReasonDictEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException;

}
