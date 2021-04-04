package com.wllfengshu.car.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_customer")
public class TbCustomerEntity implements Serializable {

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
    * 昵称
    */
    private String nickname;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * 性别
    */
    private Boolean sex;

    /**
    * 已婚
    */
    private Boolean hasMarry;

    /**
    * 电话1
    */
    private String phone1;

    /**
    * 电话2
    */
    private String phone2;

    /**
    * 电话3
    */
    private String phone3;

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
    * 公司
    */
    private String company;

    /**
    * 公司地址
    */
    private String companyAddress;

    /**
    * 职业
    */
    private String occupation;

    /**
    * 薪资
    */
    private String salary;

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
