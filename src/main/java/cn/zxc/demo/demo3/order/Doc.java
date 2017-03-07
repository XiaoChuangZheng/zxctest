package cn.zxc.demo.demo3.order;

public class Doc {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Doc(String title, String content, String orginal, String date, String type, String platform, String url) {
		super();
		this.title = title;
		this.content = content;
		this.orginal = orginal;
		this.date = date;
		this.type = type;
		this.platform = platform;
		this.url = url;
	}
	private String title;
	private String content;
	private String orginal;
	private String date;
	private String type;
	private String platform;
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOrginal() {
		return orginal;
	}
	public void setOrginal(String orginal) {
		this.orginal = orginal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
}
