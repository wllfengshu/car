package com.wllfengshu.car.service;

import com.wllfengshu.car.model.entity.TbCustomerEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbCustomerService {

    Map<String, Object> insert(TbCustomerEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbCustomerEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException;

}
