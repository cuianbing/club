package top.qudasai.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.Collage;

/**
 * ѧԺ
 * @author cuian
 *
 */
@Repository
public interface CollageMapper {
     
	/**
	 * ��ѯ����ѧԺ��Ϣ
	 * @return
	 */
	public List<Collage> findAllCollage();
	
	/**
	 * ����id��ѯѧԺ��Ϣ
	 * @return
	 */
	public Collage findCollageById(Integer collageId);
}