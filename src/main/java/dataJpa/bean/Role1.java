package dataJpa.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SYSTEM_ROLE")
public class Role1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",insertable=false,updatable=false)
    private long id;

    private String roleName;

    private Date createDate;

    private Date updateDate;

    private String description;
    
    private long roleNum;
    
    @OneToMany(mappedBy = "role1")
    private List<Menu1> menu1 = new ArrayList<Menu1>();

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

	public List<Menu1> getMenu1() {
		return menu1;
	}

	public void setMenu1(List<Menu1> menu1) {
		this.menu1 = menu1;
	}

	public long getRoleNum() {
		return roleNum;
	}

	public void setRoleNum(long roleNum) {
		this.roleNum = roleNum;
	}

	@Override
	public String toString() {
		return "Role1 [id=" + id + ", roleName=" + roleName + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", description=" + description + ", roleNum=" + roleNum + ", menu1=" + menu1 + "]";
	}
	
	
    
}
