package top.qudasai.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.qudasai.mapper.NewsMapper;
import top.qudasai.service.NewsService;
import top.qudasai.vo.ClubNews;

@Service
public class NewsServicesImpl implements NewsService {
    
	@Resource
	private NewsMapper newsMappre;
	
	/**
	 * 查找最新的N条新闻
	 * @return
	 */
	public List<ClubNews> findNewsTop(Integer num) {
		List<ClubNews> NewsTop = newsMappre.findNewsTop(num);
		return NewsTop;
	}
}
