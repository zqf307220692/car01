package com.zb.mapper;
import com.zb.entity.Manager;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {

	public Manager getManagerById(@Param(value = "id") Long id)throws Exception;

	public List<Manager>	getManagerListByMap(Map<String,Object> param)throws Exception;

	public Integer getManagerCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertManager(Manager manager)throws Exception;

	public Integer updateManager(Manager manager)throws Exception;

	public Integer deleteManagerById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteManager(Map<String,List<String>> params);

}
