package com.wllfengshu.car.dao;

import com.wllfengshu.car.model.entity.TbCarRepairEntity;
import com.wllfengshu.car.model.vo.CarRepairVO;
import com.wllfengshu.car.utils.MapperUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TbCarRepairDAO extends MapperUtil<TbCarRepairEntity> {

    List<CarRepairVO> selects(Map<String, Object> params);
}
