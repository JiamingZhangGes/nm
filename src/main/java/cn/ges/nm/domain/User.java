package cn.ges.nm.domain;

import java.util.Date;

public class User {
    private Integer id;
    // 主动创建时间
    private Date gmtCreate;
    // 被动更新时间
    private Date gmtModified;

    private String userName;
    private String userIp;
    private String userMac;

    // 用户部门ID
    private Integer userDepartment;
    //  是否离职 1为离职 0为在职
    private int isDimission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserMac() {
        return userMac;
    }

    public void setUserMac(String userMac) {
        this.userMac = userMac;
    }

    public Integer getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(Integer userDepartment) {
        this.userDepartment = userDepartment;
    }

    public int getIsDimission() {
        return isDimission;
    }

    public void setIsDimission(int isDimission) {
        this.isDimission = isDimission;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", userName='" + userName + '\'' +
                ", userIp='" + userIp + '\'' +
                ", userMac='" + userMac + '\'' +
                ", userDepartment=" + userDepartment +
                ", isDimission=" + isDimission +
                '}';
    }

}
