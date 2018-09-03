package top.qudasai.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.qudasai.mapper.ClbumMapper;
import top.qudasai.mapper.CollageMapper;
import top.qudasai.service.CollageAndClass;
import top.qudasai.vo.Clbum;
import top.qudasai.vo.Collage;


/**
 * 学院和班级操作
 * @author cuian
 *
 */
@Service
public class CollageAndClassImpl implements CollageAndClass {

	@Resource
	private CollageMapper collageMapper;
	
	@Resource
	private ClbumMapper clbumMapper;
	
	public List<Collage> findAllCollage() {
		List<Collage> listCollage = collageMapper.findAllCollage();
		return listCollage;
	}

	public Collage findCollageById(Integer collageId) {
		Collage collageById = collageMapper.findCollageById(collageId);
		return collageById;
	}

	public List<Clbum> findAllClbum() {
		List<Clbum> allClbum = clbumMapper.findAllClbum();
		return allClbum;
	}

	public List<Clbum> findClbumByCollageId(Integer collageId) {
		List<Clbum> findClbumByCollageId = clbumMapper.findClbumByCollageId(collageId);
		return findClbumByCollageId;
	}

	public List<Clbum> findClbumByCollageIdAndAge(Integer collageId,String age) {
		List<Clbum> findClbumByCollageIdAndAge = clbumMapper.findClbumByCollageIdAndAge(collageId, age);
		return findClbumByCollageIdAndAge;
	}

}
