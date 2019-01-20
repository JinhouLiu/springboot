package com.jinhou.springboot.domain;

public class RolePremissionPO extends  BaseEntity {

    private Long premissionId;

    private Long roleId;

	public Long getPremissionId() {
		return premissionId;
	}

	public void setPremissionId(Long premissionId) {
		this.premissionId = premissionId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}