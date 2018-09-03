package top.qudasai.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.Collage;

/**
 * 学院
 * @author cuian
 *
 */
@Repository
public interface CollageMapper {
     
	/**
	 * 查询所有学院信息
	 * @return
	 */
	public List<Collage> findAllCollage();
	
	/**
	 * 根据id查询学院信息
	 * @return
	 */
	public Collage findCollageById(Integer collageId);
}