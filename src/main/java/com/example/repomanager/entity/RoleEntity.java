package com.example.repomanager.entity;
import com.example.repomanager.common.recrole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * 角色实体类
 * @author koala
 *
 */
@Entity
public class RoleEntity{
	
	private @Id
	@GeneratedValue long rId;							//主键
	private String rName;						//角色名称
	private String rDetail;						//角色描述
	private Date rCreate;						//创建时间//记得列表使用JsonIgnore
	@JsonIgnore
	@OneToMany(mappedBy = "role",fetch= FetchType.LAZY)
	//mappedBy="author"中的author是Article中的author属性
	public List<UserEntity> role_user_list;//文章列表
	private String rDelete;						//删除标记位
	@JsonIgnore
	@ManyToMany
	@JoinTable(inverseJoinColumns = @JoinColumn(name = "menu_id"))
	private List<MenuEntity> menuList ;//角色允许的菜单权限
	public RoleEntity(recrole role){
		this.rName="用户";
		this.rId=2;
	}
	public RoleEntity(){}
	public long getrId() {
		return rId;
	}

	public void setrId(long rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrDetail() {
		return rDetail;
	}

	public void setrDetail(String rDetail) {
		this.rDetail = rDetail;
	}

	public Date getrCreate() {
		return rCreate;
	}

	public void setrCreate(Date rCreate) {
		this.rCreate = rCreate;
	}


	public String getrDelete() {
		return rDelete;
	}

	public void setrDelete(String rDelete) {
		this.rDelete = rDelete;
	}

	public List<MenuEntity> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuEntity> menuList) {
		this.menuList = menuList;
	}
	
}