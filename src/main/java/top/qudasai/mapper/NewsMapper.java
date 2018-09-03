package top.qudasai.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.ClubNews;

/**
 * 新闻通知
 * @author cuian
 *
 */
@Repository
public interface NewsMapper {
    
	/**
	 * 查找最新的N条新闻
	 * @return
	 */
	public List<ClubNews> findNewsTop(Integer num);
	
	
	
}