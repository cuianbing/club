package top.qudasai.vo;

import org.springframework.stereotype.Repository;

@Repository
public class RegisterVo {
    private User user;
    private UserInfo userInfo;
    private ClubInbox inbox;//ÑûÇëÂë
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public ClubInbox getInbox() {
		return inbox;
	}
	public void setInbox(ClubInbox inbox) {
		this.inbox = inbox;
	}
	@Override
	public String toString() {
		return "Register [user=" + user + ", userInfo=" + userInfo + ", inbox=" + inbox + "]";
	}
    
    
}
