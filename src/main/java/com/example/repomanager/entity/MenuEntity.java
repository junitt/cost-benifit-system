package com.example.repomanager.entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

@Entity
public class MenuEntity {

	
	private @Id
	@GeneratedValue long mId;						//主键
	private String mName;				//菜单名称
	private String mUrl;						//访问路径
	private String mPmenu;				//父级菜单id
	private String mDetail;					//菜单描述
	private String mState;					//菜单状态
	private Date mCreate;					//创建时间
	private String mDelete;				//删除标记位
	@ManyToMany(mappedBy = "menuList")
	public List<RoleEntity> rolelist;
	public long getmId() {
		return mId;
	}
	public void setmId(long mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmUrl() {
		return mUrl;
	}
	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}
	public String getmPmenu() {
		return mPmenu;
	}
	public void setmPmenu(String mPmenu) {
		this.mPmenu = mPmenu;
	}
	public String getmDetail() {
		return mDetail;
	}
	public void setmDetail(String mDetail) {
		this.mDetail = mDetail;
	}
	public String getmState() {
		return mState;
	}
	public void setmState(String mState) {
		this.mState = mState;
	}
	public Date getmCreate() {
		return mCreate;
	}
	public void setmCreate(Date mCreate) {
		this.mCreate = mCreate;
	}
	public String getmDelete() {
		return mDelete;
	}
	public void setmDelete(String mDelete) {
		this.mDelete = mDelete;
	}
	
}
