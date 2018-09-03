package top.qudasai.vo;

import org.springframework.stereotype.Repository;

@Repository
public class ClubInbox {
    private Integer id;

    private String inbox;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        this.inbox = inbox == null ? null : inbox.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "ClubInbox [id=" + id + ", inbox=" + inbox + ", userId=" + userId + "]";
	}
    
    
}