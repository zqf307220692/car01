package com.zb.mapper;
import com.zb.entity.Pinggu;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PingguMapper {

	public Pinggu getPingguById(@Param(value = "id") Long id)throws Exception;

	public List<Pinggu>	getPingguListByMap(Map<String,Object> param)throws Exception;

	public Integer getPingguCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPinggu(Pinggu pinggu)throws Exception;

	public Integer updatePinggu(Pinggu pinggu)throws Exception;

	public Integer deletePingguById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeletePinggu(Map<String,List<String>> params);

}
