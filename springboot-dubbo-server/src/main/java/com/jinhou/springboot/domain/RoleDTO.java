package com.jinhou.springboot.domain;

public class RoleDTO {

    /** 角色名称 */
    private String name;

    /** 描述 */
    private String remark;


    private int status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
