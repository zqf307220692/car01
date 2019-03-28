package com.zb.mapper;
import com.zb.entity.Carbuy;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarbuyMapper {

	public Carbuy getCarbuyById(@Param(value = "id") Integer id)throws Exception;

	public List<Carbuy>	getCarbuyListByMap(Map<String,Object> param)throws Exception;

	public Integer getCarbuyCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCarbuy(Carbuy carbuy)throws Exception;

	public Integer updateCarbuy(Carbuy carbuy)throws Exception;

	public Integer deleteCarbuyById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteCarbuy(Map<String,List<String>> params);

}
