package dataJpa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dataJpa.bean.Menu1;
import dataJpa.bean.Role1;
import dataJpa.bean.SystemRole;
import dataJpa.dao.RoleMenuDao;
import dataJpa.dao.SystemRoleDao;

@Controller
public class SystemRoleController {
	private static final Logger log = LoggerFactory.getLogger(SystemRoleController.class);
	@Autowired
	private SystemRoleDao systemRoleDao;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<SystemRole> getRoleList(){
		return systemRoleDao.querySystemRoleByIdJPQL(1);
	}
	@Autowired
	private RoleMenuDao roleMenuDao;
	
	@RequestMapping("/list2")
	@ResponseBody
	public List<Role1> getRoleList2(){
		List<Role1> r = roleMenuDao.findAll();
		 return r;
	}
}
