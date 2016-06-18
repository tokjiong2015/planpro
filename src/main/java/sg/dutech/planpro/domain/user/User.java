package sg.dutech.planpro.domain.user;

import java.util.Date;

public class User implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userUuid;
	private String name;
	private String password;
	private String email;
	private byte[] profile;
	private String location;
	private String ecrgUuid;
	private String language;
	private Date rgt;
	private Boolean onetime;
	private String settingUuid;
	private String proplanUuid;
	private String tagUuid;
	private String feedback;

	public User() {
	}

	public User(String userUuid) {
		this.userUuid = userUuid;
	}

	public User(String userUuid, String name, String password, String email, byte[] profile, String location,
			String ecrgUuid, String language, Date rgt, Boolean onetime, String settingUuid, String proplanUuid,
			String tagUuid, String feedback) {
		this.userUuid = userUuid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.profile = profile;
		this.location = location;
		this.ecrgUuid = ecrgUuid;
		this.language = language;
		this.rgt = rgt;
		this.onetime = onetime;
		this.settingUuid = settingUuid;
		this.proplanUuid = proplanUuid;
		this.tagUuid = tagUuid;
		this.feedback = feedback;
	}

	public String getUserUuid() {
		return this.userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getProfile() {
		return this.profile;
	}

	public void setProfile(byte[] profile) {
		this.profile = profile;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEcrgUuid() {
		return this.ecrgUuid;
	}

	public void setEcrgUuid(String ecrgUuid) {
		this.ecrgUuid = ecrgUuid;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getRgt() {
		return this.rgt;
	}

	public void setRgt(Date rgt) {
		this.rgt = rgt;
	}

	public Boolean getOnetime() {
		return this.onetime;
	}

	public void setOnetime(Boolean onetime) {
		this.onetime = onetime;
	}

	public String getSettingUuid() {
		return this.settingUuid;
	}

	public void setSettingUuid(String settingUuid) {
		this.settingUuid = settingUuid;
	}

	public String getProplanUuid() {
		return this.proplanUuid;
	}

	public void setProplanUuid(String proplanUuid) {
		this.proplanUuid = proplanUuid;
	}

	public String getTagUuid() {
		return this.tagUuid;
	}

	public void setTagUuid(String tagUuid) {
		this.tagUuid = tagUuid;
	}

	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
