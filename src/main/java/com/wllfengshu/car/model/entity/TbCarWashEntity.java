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
@Table(name = "tb_car_wash")
public class TbCarWashEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * ID
    */
    @Id
    private Integer id;

    /**
    * 价格
    */
    @JsonSerialize(using = DoubleSerializeUtil.class)
    private Double price;

    /**
    * 客户id
    */
    private Integer customerId;

    /**
    * 汽车id
    */
    private Integer carId;

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
