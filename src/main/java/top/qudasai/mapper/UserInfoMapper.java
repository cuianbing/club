package top.qudasai.mapper;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.UserInfo;

@Repository
public interface UserInfoMapper {
	/**
	 * 根据用户ID查询用户详细信息
	 * @return
	 */
	public UserInfo findUserInfoById(String id);
	
	/**
	 * 注册时插入的信息
	 * @param user
	 * @return
	 */
	public int register(RegisterVo user);
}