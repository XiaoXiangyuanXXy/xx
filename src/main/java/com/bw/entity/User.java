package com.bw.entity;


public class User {

	//columns START
	private Integer uid;
	private String username;
	private String password;
	private String nickname;
	private String birthday;
	private String gender;
	private String locked;
	private String created;
	private String updated;
	private String pic;
	//columns END
	public User(){
	}
	public User(Integer uid,String username,String password,String nickname,String birthday,String gender,String locked,String created,String updated,String pic){
		this.uid=uid;		this.username=username;		this.password=password;		this.nickname=nickname;		this.birthday=birthday;		this.gender=gender;		this.locked=locked;		this.created=created;		this.updated=updated;		this.pic=pic;	}

	public void setUid(Integer uid){
		this.uid=uid;
	}
	public Integer getUid(){
		return uid;
	}

	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}

	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}

	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	public String getNickname(){
		return nickname;
	}

	public void setBirthday(String birthday){
		this.birthday=birthday;
	}
	public String getBirthday(){
		return birthday;
	}

	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}

	public void setLocked(String locked){
		this.locked=locked;
	}
	public String getLocked(){
		return locked;
	}

	public void setCreated(String created){
		this.created=created;
	}
	public String getCreated(){
		return created;
	}

	public void setUpdated(String updated){
		this.updated=updated;
	}
	public String getUpdated(){
		return updated;
	}

	public void setPic(String pic){
		this.pic=pic;
	}
	public String getPic(){
		return pic;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", created=" + created
				+ ", updated=" + updated + ", pic=" + pic + "]";
	}
	
	
}

