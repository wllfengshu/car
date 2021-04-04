package com.wllfengshu.car.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wllfengshu.car.utils.DoubleSerializeUtil;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_car")
public class TbCarEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * ID
    */
    @Id
    private Integer id;

    /**
    * 车牌
    */
    private String licensePlate;

    /**
    * 品牌
    */
    private String brand;

    /**
    * 型号
    */
    private String model;

    /**
    * 颜色
    */
    private String colour;

    /**
    * 购买日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;

    /**
    * 价格(单价万)
    */
    @JsonSerialize(using = DoubleSerializeUtil.class)
    private Double price;

    /**
    * 客户id
    */
    private Integer customerId;

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
