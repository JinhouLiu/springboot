package com.jinhou.springboot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permission {
	
	/** 记录id */
    private Long id;

    /** 数据归属 */
    private String owner;
    
    /** 对象类型 */
    private String resourceType;

    /** 链接地址 */
    private String value;
    
    /** 对象名称 */
    private String functionName;
    
    /** 对象层级 */
    private Integer functionLevel;
    
    /** 对象描述 */
    private String description;
    
    /** 状态，0：禁用；1：启用  */
    private int status;
    
    /** 英文名称 */
    private String functionEname;
    
    /** 父级id */
    private Long parentId;
    
    /** 权限名称  */
    private String permission;
    
    
    /** 父级名称  */
    private String parentName;
    
    /** 英文名称 */
    private int ordNum;
    
    /** 创建时间 */
    private Date createDatetime;
    
    /** 创建者  */
    private String creator;
    
    /** 修改时间 */
    private Date modifyDatetime;
    
    /** 修改者  */
    private String modifier;
    
    /** 菜单图标 */
    private int icon;
    
	/** 下级分类 */
	private List<Permission> children = new ArrayList<Permission>();

	/** 角色 */
	private Set<Roles> roles = new HashSet<Roles>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Integer getFunctionLevel() {
		return functionLevel;
	}

	public void setFunctionLevel(Integer functionLevel) {
		this.functionLevel = functionLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFunctionEname() {
		return functionEname;
	}

	public void setFunctionEname(String functionEname) {
		this.functionEname = functionEname;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public int getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(int ordNum) {
		this.ordNum = ordNum;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getModifyDatetime() {
		return modifyDatetime;
	}

	public void setModifyDatetime(Date modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public List<Permission> getChildren() {
		return children;
	}

	public void setChildren(List<Permission> children) {
		this.children = children;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	
	
    
}