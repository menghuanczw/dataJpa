package dataJpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import dataJpa.bean.SystemRole;
@org.springframework.stereotype.Repository
public interface SystemRoleDao extends Repository<SystemRole, Integer>{
	@Query(value="from SystemRole where id = ?1")
	List<SystemRole> querySystemRoleByIdJPQL(long id);
}
