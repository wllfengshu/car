package com.wllfengshu.car.service;

import com.wllfengshu.car.entity.TbCarEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbCarService {

    Map<String, Object> insert(TbCarEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbCarEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, String sessionId) throws CustomException;

}
