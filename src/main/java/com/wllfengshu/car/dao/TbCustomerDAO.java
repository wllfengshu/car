package com.wllfengshu.car.dao;

import com.wllfengshu.car.model.entity.TbCustomerEntity;
import com.wllfengshu.car.model.vo.CustomerVO;
import com.wllfengshu.car.utils.MapperUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TbCustomerDAO extends MapperUtil<TbCustomerEntity> {

    List<CustomerVO> selects(Map<String, Object> params);
}
