package top.qudasai.vo;

import org.springframework.stereotype.Repository;

/**
 * 管理部门
 * @author cuian
 *
 */
@Repository
public class ClubManagement {
    private Integer managementId;

    private String managementName;

    private String fristPrincipal;

    private String secondPrincipal;

    private String thirdPrincipal;

    private String fourthPrincipal;

    public Integer getManagementId() {
        return managementId;
    }

    public void setManagementId(Integer managementId) {
        this.managementId = managementId;
    }

    public String getManagementName() {
        return managementName;
    }

    public void setManagementName(String managementName) {
        this.managementName = managementName == null ? null : managementName.trim();
    }

    public String getFristPrincipal() {
        return fristPrincipal;
    }

    public void setFristPrincipal(String fristPrincipal) {
        this.fristPrincipal = fristPrincipal == null ? null : fristPrincipal.trim();
    }

    public String getSecondPrincipal() {
        return secondPrincipal;
    }

    public void setSecondPrincipal(String secondPrincipal) {
        this.secondPrincipal = secondPrincipal == null ? null : secondPrincipal.trim();
    }

    public String getThirdPrincipal() {
        return thirdPrincipal;
    }

    public void setThirdPrincipal(String thirdPrincipal) {
        this.thirdPrincipal = thirdPrincipal == null ? null : thirdPrincipal.trim();
    }

    public String getFourthPrincipal() {
        return fourthPrincipal;
    }

    public void setFourthPrincipal(String fourthPrincipal) {
        this.fourthPrincipal = fourthPrincipal == null ? null : fourthPrincipal.trim();
    }

	@Override
	public String toString() {
		return "ClubManagement [managementId=" + managementId + ", managementName=" + managementName
				+ ", fristPrincipal=" + fristPrincipal + ", secondPrincipal=" + secondPrincipal + ", thirdPrincipal="
				+ thirdPrincipal + ", fourthPrincipal=" + fourthPrincipal + "]";
	}
    
    
}