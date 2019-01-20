package com.jinhou.springboot.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermissionPO extends  BaseEntity {

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

    /** 创建者  */
    private Long creator;

    /** 修改者  */
    private Long updater;
    
    /** 菜单图标 */
    private int icon;
    
	/** 下级分类 */
	private List<PermissionPO> children = new ArrayList<PermissionPO>();

	/** 角色 */
	private Set<RolePO> roles = new HashSet<RolePO>();

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


	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Long getUpdater() {
		return updater;
	}

	public void setUpdater(Long updater) {
		this.updater = updater;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public List<PermissionPO> getChildren() {
		return children;
	}

	public void setChildren(List<PermissionPO> children) {
		this.children = children;
	}

	public Set<RolePO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RolePO> roles) {
		this.roles = roles;
	}
	

}