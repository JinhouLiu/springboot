package com.jinhou.springboot.domain;

public class RolesPremission {
    private Long id;

    private Long premissionId;

    private Long roleId;

    public Long getId() {
        return id;
    }

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

	public void setId(Long id) {
		this.id = id;
	}

   
}