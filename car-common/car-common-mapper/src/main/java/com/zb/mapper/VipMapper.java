package com.zb.mapper;
import com.zb.entity.Vip;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipMapper {

	public Vip getVipById(@Param(value = "id") Long id)throws Exception;

	public List<Vip>	getVipListByMap(Map<String,Object> param)throws Exception;

	public Integer getVipCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertVip(Vip vip)throws Exception;

	public Integer updateVip(Vip vip)throws Exception;

	public Integer deleteVipById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteVip(Map<String,List<String>> params);

}
