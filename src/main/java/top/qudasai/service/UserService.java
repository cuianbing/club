package top.qudasai.service;

import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.User;
import top.qudasai.vo.UserInfo;



public interface UserService {
    /**
     * �û���¼
     * @param user
     * @return
     */
	public User login(User user);
	
	/**
	 * �����û�ID��ѯ�û���ϸ��Ϣ
	 * @return
	 */
	public UserInfo findUserInfoById(String id);
	
	/**
	 * �û�ע��
	 * @return
	 */
	public int registerUser(RegisterVo user);
}
