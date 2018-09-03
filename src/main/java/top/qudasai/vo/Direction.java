package top.qudasai.vo;

import org.springframework.stereotype.Repository;

/**
 * 方向参考表
 * @author cuian
 *
 */
@Repository
public class Direction {
    private Integer directionId;//方向id

    private String directionName;//方向名字

    private String fristPrincipal;//第一负责人

    private String secondPrincipal;

    private String thirdPrincipal;

    private String fourthPrincipal;

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName == null ? null : directionName.trim();
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
		return "ClubDirection [directionId=" + directionId + ", directionName=" + directionName + ", fristPrincipal="
				+ fristPrincipal + ", secondPrincipal=" + secondPrincipal + ", thirdPrincipal=" + thirdPrincipal
				+ ", fourthPrincipal=" + fourthPrincipal + "]";
	}
    
    
}