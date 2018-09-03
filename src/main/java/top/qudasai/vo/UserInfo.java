package top.qudasai.vo;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfo {
    private Integer userId;
    
    private String userName;

    private String userEmail;

    private String userSex;

    private String userBrith;

    private String userClass;

    private String userIphone;

    private String userCollege;

    private String userMajor;

    private String firstDirection;

    private String secondDirection;

    private String thirdDirection;

    private String userPassword;
    
    
    public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserBrith() {
        return userBrith;
    }

    public void setUserBrith(String userBrith) {
        this.userBrith = userBrith == null ? null : userBrith.trim();
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass == null ? null : userClass.trim();
    }

    public String getUserIphone() {
        return userIphone;
    }

    public void setUserIphone(String userIphone) {
        this.userIphone = userIphone == null ? null : userIphone.trim();
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege == null ? null : userCollege.trim();
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor == null ? null : userMajor.trim();
    }

    public String getFirstDirection() {
        return firstDirection;
    }

    public void setFirstDirection(String firstDirection) {
        this.firstDirection = firstDirection == null ? null : firstDirection.trim();
    }

    public String getSecondDirection() {
        return secondDirection;
    }

    public void setSecondDirection(String secondDirection) {
        this.secondDirection = secondDirection == null ? null : secondDirection.trim();
    }

    public String getThirdDirection() {
        return thirdDirection;
    }

    public void setThirdDirection(String thirdDirection) {
        this.thirdDirection = thirdDirection == null ? null : thirdDirection.trim();
    }

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userSex="
				+ userSex + ", userBrith=" + userBrith + ", userClass=" + userClass + ", userIphone=" + userIphone
				+ ", userCollege=" + userCollege + ", userMajor=" + userMajor + ", firstDirection=" + firstDirection
				+ ", secondDirection=" + secondDirection + ", thirdDirection=" + thirdDirection + ", userPassword="
				+ userPassword + "]";
	}

	
    
    
}