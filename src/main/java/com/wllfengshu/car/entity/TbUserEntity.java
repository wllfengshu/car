package com.wllfengshu.car.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class TbUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * ID
    */
    @Id
    private Integer id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 登陆名
    */
    private String loginName;

    /**
    * 密码
    */
    private String password;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * 电话
    */
    private String phone;

    /**
    * 微信
    */
    private String wechat;

    /**
    * QQ
    */
    private String qq;

    /**
    * 其他联系人1
    */
    private String otherContacts1;

    /**
    * 其他联系人2
    */
    private String otherContacts2;

    /**
    * 住址
    */
    private String address;

    /**
    * 岗位
    */
    private String post;

    /**
    * 备注
    */
    private String remark;

    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
    * 修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}
