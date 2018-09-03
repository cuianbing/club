package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.ClubInbox;
/**
 * 邀请码的操作
 * @author cuian
 *
 */

public interface InboxService {
    
	/**
	 * 查询所有邀请码
	 * @return 返回邀请码详细
	 */
	public List<ClubInbox> allClubInbox();
	
	/**
	 * 查找邀请码是否存在
	 * @return
	 */
	public Boolean findInboxBy(String inbox);
	
	/**
	 * 查询所有邀请码
	 * @return  只返回邀请码字段
	 */
	public List<String> findAllInbox();
}
