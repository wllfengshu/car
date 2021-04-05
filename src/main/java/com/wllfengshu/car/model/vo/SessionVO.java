package com.wllfengshu.car.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangll
 * @date 2021-04-05 1:01
 */
@Data
public class SessionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String loginName;
    private String name;
    private String phone;
    private String wechat;
    private String address;
    private String post;

    private String sessionId;
    private Date createTime;
}
