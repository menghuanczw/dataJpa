package dataJpa.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYSTEM_ROLE_MENU_INFO")
public class SystemRoleMenuInfo {
	@Id
    private long id;

    private long roleId;

    private long menuId;

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

	@Override
	public String toString() {
		return "SystemRoleMenuInfo [id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + "]";
	}

   
}