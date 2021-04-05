package com.wllfengshu.car.dao;

import com.wllfengshu.car.model.entity.TbCarWashEntity;
import com.wllfengshu.car.model.vo.CarWashVO;
import com.wllfengshu.car.utils.MapperUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TbCarWashDAO extends MapperUtil<TbCarWashEntity> {

    List<CarWashVO> selects(Map<String, Object> params);
}
