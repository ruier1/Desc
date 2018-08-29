package entity;

import java.sql.Date;

public class User {
	private Integer id; //id 
	private String userCode; //鐢ㄦ埛缂栫爜
	private String userName; //鐢ㄦ埛鍚嶇О
	private String userPassword; //鐢ㄦ埛瀵嗙爜
	private Integer gender;  //鎬у埆
	private Date birthday;  //鍑虹敓鏃ユ湡
	private String phone;   //鐢佃瘽
	private String address; //鍦板潃
	private Integer userRole;    //鐢ㄦ埛瑙掕壊ID
	private Integer createdBy;   //鍒涘缓锟�?
	private Date creationDate; //鍒涘缓鏃堕棿
	private Integer modifyBy;     //鏇存柊锟�?
	private Date modifyDate;   //鏇存柊鏃堕棿
	private String roleName;
	private	int age;
	
//	private Integer age;//骞撮緞
	//private String userRoleName; //鐢ㄦ埛瑙掕壊鍚嶇О
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	//association
	private Role role; //鐢ㄦ埛瑙掕壊
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

//	public Integer getAge() {
//		/*long time = System.currentTimeMillis()-birthday.getTime();
//		Integer age = Long.valueOf(time/365/24/60/60/1000).IntegerValue();*/
//		Date date = new Date();
//		Integer age = date.getYear()-birthday.getYear();
//		return age;
//	}
	
/*	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
