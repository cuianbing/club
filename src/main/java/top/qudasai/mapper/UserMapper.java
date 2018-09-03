package top.qudasai.mapper;

import org.springframework.stereotype.Repository;

import top.qudasai.vo.RegisterVo;
import top.qudasai.vo.User;


@Repository
public interface UserMapper {
    
	public User login(User u);
	
	/**
	 * ע��ʱ�������Ϣ
	 * @param user
	 * @return
	 */
	public int register(RegisterVo user);
}