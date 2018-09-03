package top.qudasai.vo;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ClubNews {
    private Integer newsId;

    private Date newsDate;

    private String newsTitle;

    private Integer userId;

    private String newsUrl;

    private String newsType;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }

	@Override
	public String toString() {
		return "ClubNews [newsId=" + newsId + ", newsDate=" + newsDate + ", newsTitle=" + newsTitle + ", userId="
				+ userId + ", newsUrl=" + newsUrl + ", newsType=" + newsType + "]";
	}
    
    
    
}