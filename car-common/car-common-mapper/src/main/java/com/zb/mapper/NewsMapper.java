package com.zb.mapper;
import com.zb.entity.News;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper {

	public News getNewsById(@Param(value = "id") Long id)throws Exception;//通过id获取新闻列表

	public List<News>	getNewsListByMap(Map<String,Object> param)throws Exception;//通过map获取新闻列表

	public Integer getNewsCountByMap(Map<String,Object> param)throws Exception;//获取新闻总条数

	public Integer insertNews(News news)throws Exception;//添加新闻

	public Integer updateNews(News news)throws Exception;//更改新闻

	public Integer deleteNewsById(@Param(value = "id") Long id)throws Exception;//删除新闻

	public Integer batchDeleteNews(Map<String,List<String>> params);

}
