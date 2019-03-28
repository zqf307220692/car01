package com.zb.mapper;
import com.zb.entity.Area;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper {
  //zn
	public Area getAreaById(@Param(value = "id") Long id)throws Exception;

	public List<Area>	getAreaListByMap(Map<String,Object> param)throws Exception;

	public Integer getAreaCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertArea(Area area)throws Exception;

	public Integer updateArea(Area area)throws Exception;

	public Integer deleteAreaById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteArea(Map<String,List<String>> params);

}
