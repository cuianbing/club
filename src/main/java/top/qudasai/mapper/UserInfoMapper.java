package top.qudasai.mapper;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.UserInfo;

@Repository
public interface UserInfoMapper {
	/**
	 * �����û�ID��ѯ�û���ϸ��Ϣ
	 * @return
	 */
	public UserInfo findUserInfoById(String id);
	
	/**
	 * ע��ʱ�������Ϣ
	 * @param user
	 * @return
	 */
	public int register(RegisterVo user);
}