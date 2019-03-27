package com.zb.mapper;
import com.zb.entity.Garage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GarageMapper {

	public Garage getGarageById(@Param(value = "id") Long id)throws Exception;

	public List<Garage>	getGarageListByMap(Map<String,Object> param)throws Exception;

	public Integer getGarageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGarage(Garage garage)throws Exception;

	public Integer updateGarage(Garage garage)throws Exception;

	public Integer deleteGarageById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGarage(Map<String,List<String>> params);

}
