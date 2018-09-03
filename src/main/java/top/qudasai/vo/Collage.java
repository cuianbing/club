package top.qudasai.vo;

public class Collage {
    private Integer collageId;

    private String collageName;

    public Integer getCollageId() {
        return collageId;
    }

    public void setCollageId(Integer collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName == null ? null : collageName.trim();
    }

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + "]";
	}
    
    
}