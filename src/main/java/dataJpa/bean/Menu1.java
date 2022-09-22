package dataJpa.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="SYSTEM_ROLE_MENU_INFO")
public class Menu1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",insertable=false,updatable=false)
    private long id;
	
	
    private long roleId;


    private long menuId;
    
    @ManyToOne(cascade = CascadeType.PERSIST)	//表示多方
	@JoinColumn(name ="role_num")	//维护一个外键，外键在Users一侧
    private Role1 role1;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public Role1 getRole1() {
		return role1;
	}

	public void setRole1(Role1 role1) {
		this.role1 = role1;
	}

	@Override
	public String toString() {
		return "Menu1 [id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + ", role1=" + role1 + "]";
	}

    
    
}
