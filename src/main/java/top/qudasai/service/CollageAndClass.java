package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.Clbum;
import top.qudasai.vo.Collage;

/**
 * ѧԺ�༶��Ϣ��ѯ
 * @author cuian
 *
 */

public interface CollageAndClass {
    
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
	/**
	 * ��ѯ���еİ༶��Ϣ
	 * @return
	 */
	public List<Clbum> findAllClbum();
	
	/**
	 * ����ѧԺID��ѯ��ѧԺ���еİ༶
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageId(Integer collageId);
	
	/**
	 * ����ѧԺId���꼶��ѯ���а༶
	 * @param collageId
	 * @return
	 */
	public List<Clbum> findClbumByCollageIdAndAge(Integer collageId,String age);
}
