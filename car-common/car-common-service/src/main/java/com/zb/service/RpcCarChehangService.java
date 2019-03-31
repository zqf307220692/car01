package com.zb.service;

import com.zb.dto.PageUtil;
import com.zb.entity.Garage;

public interface RpcCarChehangService {
   //分页查询车行
   public PageUtil<Garage> findGaragePage(Integer index);
   //添加车行
   public int addGarage(Garage garage);
   //删除车行
   public int delGarage(Integer gId);
   //修改车行信息
   public int updateGarage(Garage garage);

}
