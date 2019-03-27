package com.zb.mapper;
import com.zb.entity.Carrent;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarrentMapper {

	public Carrent getCarrentById(@Param(value = "id") Long id)throws Exception;

	public List<Carrent>	getCarrentListByMap(Map<String,Object> param)throws Exception;

	public Integer getCarrentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCarrent(Carrent carrent)throws Exception;

	public Integer updateCarrent(Carrent carrent)throws Exception;

	public Integer deleteCarrentById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCarrent(Map<String,List<String>> params);

}
