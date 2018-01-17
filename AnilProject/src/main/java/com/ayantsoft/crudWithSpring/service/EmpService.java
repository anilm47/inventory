package com.ayantsoft.crudWithSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayantsoft.crudWithSpring.dao.EmpDao;

import com.ayantsoft.hibernate.pojo.Item;

@Service
public class EmpService {

	@Autowired
	private EmpDao empDao;

	public void insertEmpService(Item i){
		empDao.insertEmpDao(i);

	}
	public List<Item> getAllEmpService(){

		return empDao.getAllEmpDao();
	}
	public Item getEmpByIdService(Integer id){

		return empDao.getEmpByIdDao(id);
	}
	public void deleteItemByIdService(Integer i){

		empDao.deleteItemDao(i);
	}
	/*public List<Emp> getAllEmpService(){

		return empDao.getAllEmpDao();
	}

	public Emp getEmpByIdService(Integer id){

		return empDao.getEmpByIdDao(id);
	}
	
	public void updateEmpService(Emp emp){
		empDao.updateEmpDao(emp);

	}*/
}
