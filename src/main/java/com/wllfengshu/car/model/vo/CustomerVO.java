package com.wllfengshu.car.model.vo;

import com.wllfengshu.car.model.entity.TbCustomerEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangll
 * @date 2021-04-05 1:01
 */
@Data
public class CustomerVO extends TbCustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone;
    private String otherContacts;
}
