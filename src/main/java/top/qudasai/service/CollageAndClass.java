package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.Clbum;
import top.qudasai.vo.Collage;

/**
 * 学院班级信息查询
 * @author cuian
 *
 */

public interface CollageAndClass {
    
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
	/**
	 * 查询所有的班级信息
	 * @return
	 */
	public List<Clbum> findAllClbum();
	
	/**
	 * 根据学院ID查询该学院所有的班级
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageId(Integer collageId);
	
	/**
	 * 根据学院Id和年级查询所有班级
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageIdAndAge(Integer collageId,String age);
}
