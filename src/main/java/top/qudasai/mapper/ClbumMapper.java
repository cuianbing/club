package top.qudasai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import top.qudasai.vo.Clbum;

/**
 * �༶
 * 
 * @author cuian
 *
 */
@Repository
public interface ClbumMapper {

	

	/**
	 * ��ѯ���еİ༶��Ϣ
	 * 
	 * @return
	 */
	public List<Clbum> findAllClbum();

	/**
	 * ����ѧԺID��ѯ��ѧԺ���еİ༶
	 * 
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageId(Integer collageId);

	/**
	 * ����ѧԺId���꼶��ѯ���а༶
	 * 
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageIdAndAge(@Param("collageId") Integer collageId, @Param("age") String age);
}