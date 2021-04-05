package com.wllfengshu.car.model.vo;

import com.wllfengshu.car.model.entity.TbCarRepairEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangll
 * @date 2021-04-05 1:01
 */
@Data
public class CarRepairVO extends TbCarRepairEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String faultReason;

    private String customerName;
    private String customerNickname;
    private String phone;

    private String licensePlate;
}
