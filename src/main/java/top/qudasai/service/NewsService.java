package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.ClubNews;

public interface NewsService {
      
	/**
	 * �������µ�N������
	 * @return
	 */
	public List<ClubNews> findNewsTop(Integer num);
}
