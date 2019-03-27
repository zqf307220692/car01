package com.zb.mapper;
import com.zb.entity.News;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper {

	public News getNewsById(@Param(value = "id") Long id)throws Exception;

	public List<News>	getNewsListByMap(Map<String,Object> param)throws Exception;

	public Integer getNewsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertNews(News news)throws Exception;

	public Integer updateNews(News news)throws Exception;

	public Integer deleteNewsById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteNews(Map<String,List<String>> params);

}
