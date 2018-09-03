package top.qudasai.vo;

import org.springframework.stereotype.Repository;

@Repository
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private Byte userGroup;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	public Byte getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(Byte userGroup) {
		this.userGroup = userGroup;
	}

	public String getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userGroup="
				+ userGroup + "]";
	}

}