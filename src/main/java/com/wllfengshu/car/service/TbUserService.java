package com.wllfengshu.car.service;

import com.wllfengshu.car.entity.TbUserEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbUserService {

    Map<String, Object> insert(TbUserEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbUserEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException;

}
