package com.wllfengshu.car.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangll
 * @date 2021-04-05 1:04
 */
@Data
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String loginName;
    private String password;
}
