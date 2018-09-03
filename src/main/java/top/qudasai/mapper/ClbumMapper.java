package top.qudasai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import top.qudasai.vo.Clbum;

/**
 * 班级
 * 
 * @author cuian
 *
 */
@Repository
public interface ClbumMapper {

	

	/**
	 * 查询所有的班级信息
	 * 
	 * @return
	 */
	public List<Clbum> findAllClbum();

	/**
	 * 根据学院ID查询该学院所有的班级
	 * 
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageId(Integer collageId);

	/**
	 * 根据学院Id和年级查询所有班级
	 * 
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageIdAndAge(@Param("collageId") Integer collageId, @Param("age") String age);
}