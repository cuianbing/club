package top.qudasai.service;

import java.util.List;

import top.qudasai.vo.ClubInbox;
/**
 * ������Ĳ���
 * @author cuian
 *
 */

public interface InboxService {
    
	/**
	 * ��ѯ����������
	 * @return ������������ϸ
	 */
	public List<ClubInbox> allClubInbox();
	
	/**
	 * �����������Ƿ����
	 * @return
	 */
	public Boolean findInboxBy(String inbox);
	
	/**
	 * ��ѯ����������
	 * @return  ֻ�����������ֶ�
	 */
	public List<String> findAllInbox();
}
