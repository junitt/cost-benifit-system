package com.example.usermanager;

public class User {
    private int u_id; // 主键
    private String u_name; // 用户名称
    private String u_gender; // 性别
    private String u_phone; // 电话
    private String u_address; // 地址
    private String u_email; // 邮件
    private String u_role_id; // 角色主键
    private String u_account; // 登陆账号
    private String u_pwd; // 密码

    public User(int u_id, String u_name,
                String u_gender, String u_phone,
                String u_address, String u_email,
                String u_role_id, String u_account,
                String u_pwd, String u_detail,
                String u_state, String u_create,
                String u_creater, String u_update,
                String u_delete, String userDelete) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_gender = u_gender;
        this.u_phone = u_phone;
        this.u_address = u_address;
        this.u_email = u_email;
        this.u_role_id = u_role_id;
        this.u_account = u_account;
        this.u_pwd = u_pwd;
        this.u_detail = u_detail;
        this.u_state = u_state;
        this.u_create = u_create;
        this.u_creater = u_creater;
        this.u_update = u_update;
        this.u_delete = u_delete;
        this.userDelete = userDelete;
    }

    private String u_detail; // 用户描述
    private String u_state; // 用户状态
    private String u_create; // 创建时间
    private String u_creater; // 创建者
    private String u_update; // 更新时间
    private String u_delete; // 删除标记位


    private String userDelete;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_gender() {
        return u_gender;
    }

    public void setU_gender(String u_gender) {
        this.u_gender = u_gender;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_role_id() {
        return u_role_id;
    }

    public void setU_role_id(String u_role_id) {
        this.u_role_id = u_role_id;
    }

    public String getU_account() {
        return u_account;
    }

    public void setU_account(String u_account) {
        this.u_account = u_account;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_detail() {
        return u_detail;
    }

    public void setU_detail(String u_detail) {
        this.u_detail = u_detail;
    }

    public String getU_state() {
        return u_state;
    }

    public void setU_state(String u_state) {
        this.u_state = u_state;
    }

    public String getU_create() {
        return u_create;
    }

    public void setU_create(String u_create) {
        this.u_create = u_create;
    }

    public String getU_creater() {
        return u_creater;
    }

    public void setU_creater(String u_creater) {
        this.u_creater = u_creater;
    }

    public String getU_update() {
        return u_update;
    }

    public void setU_update(String u_update) {
        this.u_update = u_update;
    }

    public String getU_delete() {
        return u_delete;
    }

    public void setU_delete(String u_delete) {
        this.u_delete = u_delete;
    }

    public String getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }
}
