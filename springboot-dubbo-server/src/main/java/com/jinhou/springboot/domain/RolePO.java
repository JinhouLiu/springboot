package com.jinhou.springboot.domain;

import java.util.Date;

public class RolePO extends  BaseEntity {

    /** 角色名称 */
    private String name;
    
    /** 描述 */
    private String remark;

    /** 创建者 */
    private String creator;

    /** 修改者 */
    private String modifier;
    
    /** 状态，0：禁用；1：启用  */
    private int status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}


	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
    
}