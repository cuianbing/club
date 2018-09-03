package top.qudasai.vo;

import org.springframework.stereotype.Repository;

@Repository
public class UserGroup {
    private Byte groupId;
    private String groupName;

    public Byte getGroupId() {
        return groupId;
    }

    public void setGroupId(Byte groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }
}