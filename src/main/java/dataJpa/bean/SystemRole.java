package dataJpa.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SYSTEM_ROLE")
public class SystemRole {
	@Id
    private long id;

    private String roleName;

    private Date createDate;

    private Date updateDate;

    private String description;
    
    private long roleNum;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRoleNum() {
		return roleNum;
	}

	public void setRoleNum(long roleNum) {
		this.roleNum = roleNum;
	}

	@Override
	public String toString() {
		return "SystemRole [id=" + id + ", roleName=" + roleName + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", description=" + description + ", roleNum=" + roleNum + "]";
	}

   
}