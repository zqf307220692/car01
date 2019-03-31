package com.zb.service;

import com.zb.dto.PageUtil;
import com.zb.entity.News;

public interface RpcCarNewsService {
    //分页查询新闻
    public PageUtil<News> findNewsPage(Integer index);
    //添加新闻
    public int addNews(News news);
    //删除新闻
    public int delNewsById(Integer Id);
    //修改新闻
    public int updateNews(News news);
}
