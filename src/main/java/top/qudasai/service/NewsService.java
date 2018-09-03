package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.ClubNews;

public interface NewsService {
      
	/**
	 * 查找最新的N条新闻
	 * @return
	 */
	public List<ClubNews> findNewsTop(Integer num);
}
