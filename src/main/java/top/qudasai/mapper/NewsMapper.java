package top.qudasai.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.ClubNews;

/**
 * ����֪ͨ
 * @author cuian
 *
 */
@Repository
public interface NewsMapper {
    
	/**
	 * �������µ�N������
	 * @return
	 */
	public List<ClubNews> findNewsTop(Integer num);
	
	
	
}