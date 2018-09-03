package top.qudasai.service;

import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.User;
import top.qudasai.vo.UserInfo;



public interface UserService {
    /**
     * 用户登录
     * @param user
     * @return
     */
	public User login(User user);
	
	/**
	 * 根据用户ID查询用户详细信息
	 * @return
	 */
	public UserInfo findUserInfoById(String id);
	
	/**
	 * 用户注册
	 * @return
	 */
	public int registerUser(RegisterVo user);
}
