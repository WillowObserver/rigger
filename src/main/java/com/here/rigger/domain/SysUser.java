package com.here.rigger.domain;
public class SysUser {
    private Integer userId;//员工编号
    private String userOrder;//人员顺序
    private java.util.Date userJoinTime;//入职时间
    private String userSex;//性别
    private String userMobile;//邮箱
    private String userAddr;//住址
    private String userOfficeAddr;//办公地址
    private String userNation;//民族
    private java.util.Date userDimissionTime;//离职时间
    private java.util.Date userBecomeTime;//转正时间
    private java.util.Date userCreateTime;//创建时间
    private String userPassword;//密码
    private java.util.Date userLastLoginTime;//最后登录时间
    private String userTelephone;//手机号
    private java.util.Date userBirthday;//生日
    private String userAccount;//登录名
    private String userNameChn;//中文名
    private String userNameEn;//英文名
    public SysUser() {
        super();
    }
    public SysUser(Integer userId,String userOrder,java.util.Date userJoinTime,String userSex,String userMobile,String userAddr,String userOfficeAddr,String userNation,java.util.Date userDimissionTime,java.util.Date userBecomeTime,java.util.Date userCreateTime,String userPassword,java.util.Date userLastLoginTime,String userTelephone,java.util.Date userBirthday,String userAccount,String userNameChn,String userNameEn) {
        super();
        this.userId = userId;
        this.userOrder = userOrder;
        this.userJoinTime = userJoinTime;
        this.userSex = userSex;
        this.userMobile = userMobile;
        this.userAddr = userAddr;
        this.userOfficeAddr = userOfficeAddr;
        this.userNation = userNation;
        this.userDimissionTime = userDimissionTime;
        this.userBecomeTime = userBecomeTime;
        this.userCreateTime = userCreateTime;
        this.userPassword = userPassword;
        this.userLastLoginTime = userLastLoginTime;
        this.userTelephone = userTelephone;
        this.userBirthday = userBirthday;
        this.userAccount = userAccount;
        this.userNameChn = userNameChn;
        this.userNameEn = userNameEn;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserOrder() {
        return this.userOrder;
    }

    public void setUserOrder(String userOrder) {
        this.userOrder = userOrder;
    }

    public java.util.Date getUserJoinTime() {
        return this.userJoinTime;
    }

    public void setUserJoinTime(java.util.Date userJoinTime) {
        this.userJoinTime = userJoinTime;
    }

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMobile() {
        return this.userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserAddr() {
        return this.userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserOfficeAddr() {
        return this.userOfficeAddr;
    }

    public void setUserOfficeAddr(String userOfficeAddr) {
        this.userOfficeAddr = userOfficeAddr;
    }

    public String getUserNation() {
        return this.userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public java.util.Date getUserDimissionTime() {
        return this.userDimissionTime;
    }

    public void setUserDimissionTime(java.util.Date userDimissionTime) {
        this.userDimissionTime = userDimissionTime;
    }

    public java.util.Date getUserBecomeTime() {
        return this.userBecomeTime;
    }

    public void setUserBecomeTime(java.util.Date userBecomeTime) {
        this.userBecomeTime = userBecomeTime;
    }

    public java.util.Date getUserCreateTime() {
        return this.userCreateTime;
    }

    public void setUserCreateTime(java.util.Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public java.util.Date getUserLastLoginTime() {
        return this.userLastLoginTime;
    }

    public void setUserLastLoginTime(java.util.Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserTelephone() {
        return this.userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public java.util.Date getUserBirthday() {
        return this.userBirthday;
    }

    public void setUserBirthday(java.util.Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserNameChn() {
        return this.userNameChn;
    }

    public void setUserNameChn(String userNameChn) {
        this.userNameChn = userNameChn;
    }

    public String getUserNameEn() {
        return this.userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn;
    }

}
