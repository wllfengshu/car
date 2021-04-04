package com.wllfengshu.car.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_fault_reason_dict")
public class TbFaultReasonDictEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * ID
    */
    @Id
    private Integer id;

    /**
    * 故障原因
    */
    private String faultReason;

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
