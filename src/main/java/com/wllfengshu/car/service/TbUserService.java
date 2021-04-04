package com.wllfengshu.car.service;

import com.wllfengshu.car.model.dto.LoginDTO;
import com.wllfengshu.car.model.entity.TbUserEntity;
import com.wllfengshu.car.exception.CustomException;

import java.util.Map;

public interface TbUserService {

    Map<String, Object> insert(TbUserEntity entity, String sessionId) throws CustomException;

    Map<String, Object> delete(Integer id, String sessionId) throws CustomException;

    Map<String, Object> update(TbUserEntity entity, String sessionId) throws CustomException;

    Map<String, Object> select(Integer id, String sessionId) throws CustomException;

    Map<String, Object> selects(Map<String, Object> params, Integer pageNo, Integer pageSize, String sessionId) throws CustomException;

    Map<String, Object> login(LoginDTO loginDTO) throws CustomException;

    Map<String, Object> logout(String sessionId) throws CustomException;
}
