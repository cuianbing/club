package top.qudasai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.qudasai.mapper.UserInfoMapper;
import top.qudasai.mapper.UserMapper;
import top.qudasai.service.UserService;
import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.User;
import top.qudasai.vo.UserInfo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private UserMapper userMapper;
	
	
	/**
	 * �û���¼��֤
	 */
	public User login(User user) {
		User loginuser = userMapper.login(user);
		return loginuser;
	}

	/**
	 * �����û�id�����û���ϸ��Ϣ
	 */
	public UserInfo findUserInfoById(String id) {
		UserInfo userInfo = userInfoMapper.findUserInfoById(id);
		return userInfo;
	}

	public int registerUser(RegisterVo user) {
		userInfoMapper.register(user);
		user.getUser().getUserId();
		int register2 = userMapper.register(user);
		return register2;
	}
    
}
