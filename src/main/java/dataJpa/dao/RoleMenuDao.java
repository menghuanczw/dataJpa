package dataJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import dataJpa.bean.Role1;

@org.springframework.stereotype.Repository
public interface RoleMenuDao extends JpaRepository<Role1, Integer>{

}
