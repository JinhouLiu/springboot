package com.jinhou.springboot.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * 	用户
 */
public class UserPO extends BaseEntity {
   
	private static final long serialVersionUID = 8417230779287143804L;

	/** "身份信息"参数名称 */
	public static final String PRINCIPAL_ATTRIBUTE_NAME = "UserInterceptor.PRINCIPAL";

	/** "用户名"Cookie名称 */
	public static final String USERNAME_COOKIE_NAME = "username";

	/** 用户名 */
    private String username;

	/** 密码 */
    private String password;

	/** 手机号码 */
    private String mobile;

	/** E-mail */
    private String email;

	/** 头像 */
	private String avatar;

	/** 是否启用 */
    private Boolean isEnabled;

	/** 是否锁定 */
    private Boolean isLocked;

	/** 锁定日期 */
    private Date lockedDate;

	/** 登录日期 */
    private Date loginDate;

	/** 登录失败次数 */
    private Integer loginFailureCount;

	/** 登录IP */
    private String loginIp;

	/** 注册IP */
    private String registerIp;
    
    
    /**
	 * 性别
	 */
	public enum Gender {

		/** 男 */
		male,

		/** 女 */
		female
	}
	private String address;

    private String gender;

    private String realname;

    private String nickname;

    private Integer age;
    
	/**
	 * 获取用户名
	 * 
	 * @return 用户名
	 */
	@NotEmpty(groups = Save.class)
	@Pattern(regexp = "^[0-9a-z_A-Z\\u4e00-\\u9fa5]+$")
	public String getUsername() {
		return username;
	}

	/**
	 * 设置用户名
	 * 
	 * @param username
	 *            用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取密码
	 * 
	 * @return 密码
	 */
	@NotEmpty(groups = Save.class)
	@Pattern(regexp = "^[^\\s&\"<>]+$")
	public String getPassword() {
		return password;
	}

	/**
	 * 设置密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取手机号
	 * 
	 * @return 手机号
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置手机号
	 * 
	 * @param mobile
	 *            手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取E-mail
	 * 
	 * @return E-mail
	 */
	@Email
	@Length(max = 200)
	public String getEmail() {
		return email;
	}

	/**
	 * 设置E-mail
	 * 
	 * @param email
	 *            E-mail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取用户头像
	 * 
	 * @return 用户头像
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * 设置用户头像
	 * 
	 * @param avatar
	 *            用户头像
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * 获取是否启用
	 * 
	 * @return 是否启用
	 */
	@NotNull
	public Boolean getIsEnabled() {
		return isEnabled;
	}

	/**
	 * 设置是否启用
	 * 
	 * @param isEnabled
	 *            是否启用
	 */
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * 获取是否锁定
	 * 
	 * @return 是否锁定
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * 设置是否锁定
	 * 
	 * @param isLocked
	 *            是否锁定
	 */
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	/**
	 * 获取连续登录失败次数
	 * 
	 * @return 连续登录失败次数
	 */
	public Integer getLoginFailureCount() {
		return loginFailureCount;
	}

	/**
	 * 设置连续登录失败次数
	 * 
	 * @param loginFailureCount
	 *            连续登录失败次数
	 */
	public void setLoginFailureCount(Integer loginFailureCount) {
		this.loginFailureCount = loginFailureCount;
	}
	
	/**
	 * 获取锁定日期
	 * 
	 * @return 锁定日期
	 */
	public Date getLockedDate() {
		return lockedDate;
	}

	/**
	 * 设置锁定日期
	 * 
	 * @param lockedDate
	 *            锁定日期
	 */
	public void setLockedDate(Date lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * 获取注册IP
	 * 
	 * @return 注册IP
	 */
	public String getRegisterIp() {
		return registerIp;
	}

	/**
	 * 设置注册IP
	 * 
	 * @param registerIp
	 *            注册IP
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	
	/**
	 * 获取最后登录IP
	 * 
	 * @return 最后登录IP
	 */
	public String getLoginIp() {
		return loginIp;
	}

	/**
	 * 设置最后登录IP
	 * 
	 * @param loginIp
	 *            最后登录IP
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	/**
	 * 获取最后登录日期
	 * 
	 * @return 最后登录日期
	 */
	public Date getLoginDate() {
		return loginDate;
	}

	/**
	 * 设置最后登录日期
	 * 
	 * @param loginDate
	 *            最后登录日期
	 */
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getPrincipalAttributeName() {
		return PRINCIPAL_ATTRIBUTE_NAME;
	}

	public static String getUsernameCookieName() {
		return USERNAME_COOKIE_NAME;
	}

	
}