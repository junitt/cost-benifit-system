package com.example.repomanager.entity;
import com.example.repomanager.common.recuser;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserEntity {

	private @Id
	@GeneratedValue long uId;						//主键
	private String uName;					//用户展示名称
	private String uGender;				//用户性别
	private String uPhone;					//电话
	private String uAddress;				//地址
	private String uEmail;					//邮件
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH},optional=true)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
	@JoinColumn(name="user_role_id")//设置在article表中的关联字段(外键)
	private RoleEntity role	;				//用户角色
	private String uAccount;				//登陆账号
	private String uPwd;					//密码
	private String uDetail;					//详情
	private String uState;					//用户状态
	private String uCreate;					//创建时间
	private String uUpdate;				//更新时间
	private String uDelete;					//删除标记位
	public UserEntity(){}
	public UserEntity(recuser user){
		uName=user.getuName();
		uGender=user.getuGender();
		uPhone=user.getuPhone();
		uAddress=user.getuAddress();
		uPwd=user.getuPwd();
		uDetail=user.getuDetail();
		uEmail=user.getuEmail();
		uAccount=user.getuName();
		uEmail=user.getuEmail();
		role=new RoleEntity(user.getRole());
		uPwd=user.getuPwd();
		uState=user.getuState();
		uCreate=user.getuCreate();
		uUpdate=user.getuUpdate();
		uDelete=user.getuDelete();

	}
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuGender() {
		return uGender;
	}
	public void setuGender(String uGender) {
		this.uGender = uGender;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public RoleEntity getRole() {
		return role;
	}
	public void setRole(RoleEntity role) {
		this.role = role;
	}
	public String getuAccount() {
		return uAccount;
	}
	public void setuAccount(String uAccount) {
		this.uAccount = uAccount;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuDetail() {
		return uDetail;
	}
	public void setuDetail(String uDetail) {
		this.uDetail = uDetail;
	}
	public String getuState() {
		return uState;
	}
	public void setuState(String uState) {
		this.uState = uState;
	}
	public String getuCreate() {
		return uCreate;
	}
	public void setuCreate(String uCreate) {
		this.uCreate = uCreate;
	}
	public String getuUpdate() {
		return uUpdate;
	}
	public void setuUpdate(String uUpdate) {
		this.uUpdate = uUpdate;
	}
	public String getuDelete() {
		return uDelete;
	}
	public void setuDelete(String uDelete) {
		this.uDelete = uDelete;
	}

	@Override
	public String toString() {
		return "id: "+this.getuId()+" acount: "+this.getuAccount();
	}
}
