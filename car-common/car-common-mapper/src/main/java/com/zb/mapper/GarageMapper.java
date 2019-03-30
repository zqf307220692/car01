package com.zb.mapper;
import com.zb.entity.Garage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GarageMapper {
    
	public Garage getGarageById(@Param(value = "id") Integer id)throws Exception;//通过id查询车行

	public List<Garage>	getGarageListByMap(Map<String,Object> param)throws Exception;//多条件查询车行

	public Integer getGarageCountByMap(Map<String,Object> param)throws Exception;//计算车行数目

	public Integer insertGarage(Garage garage)throws Exception;//添加车行

	public Integer updateGarage(Garage garage)throws Exception;//更新车行数据

	public Integer deleteGarageById(@Param(value = "id") Integer id)throws Exception;//通过id删除车行

	public Integer batchDeleteGarage(Map<String,List<String>> params);

	public Integer getGarageCountByType(String bType);//通过商家公司类型查车行

}
