package dataJpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import dataJpa.bean.Role1;
@org.springframework.stereotype.Repository
public interface RoleMenuDao extends JpaRepository<Role1, Integer>{

}
