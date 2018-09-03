package top.qudasai.vo;

public class Clbum {
    private Integer clbumId;

    private String clbumName;

    private Integer collageId;

    public Integer getClbumId() {
        return clbumId;
    }

    public void setClbumId(Integer clbumId) {
        this.clbumId = clbumId;
    }

    public String getClbumName() {
        return clbumName;
    }

    public void setClbumName(String clbumName) {
        this.clbumName = clbumName == null ? null : clbumName.trim();
    }

    public Integer getCollageId() {
        return collageId;
    }

    public void setCollageId(Integer collageId) {
        this.collageId = collageId;
    }

	@Override
	public String toString() {
		return "Clbum [clbumId=" + clbumId + ", clbumName=" + clbumName + ", collageId=" + collageId + "]";
	}
    
    
}