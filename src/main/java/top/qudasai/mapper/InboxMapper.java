package top.qudasai.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.ClubInbox;

/**
 * ÑûÇëÂë
 * @author cuian
 *
 */
@Repository
public interface InboxMapper {
       
	public List<ClubInbox> findAll();
	public List<String> findAllInbox();
	public ClubInbox findById();
	public ClubInbox findByInbox();
	public ClubInbox findByuserId();
}