package com.zb.mapper;
import com.zb.entity.Type;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {

	public Type getTypeById(@Param(value = "id") Long id)throws Exception;

	public List<Type>	getTypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getTypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertType(Type type)throws Exception;

	public Integer updateType(Type type)throws Exception;

	public Integer deleteTypeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteType(Map<String,List<String>> params);

}
