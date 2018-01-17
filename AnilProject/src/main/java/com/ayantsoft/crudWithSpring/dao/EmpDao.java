package com.ayantsoft.crudWithSpring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ayantsoft.crudWithSpring.util.HbernateUtil;

import com.ayantsoft.hibernate.pojo.Item;


@Repository
public class EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; 
    
		@Transactional
	public void insertEmpDao(Item i){
		try{
		hibernateTemplate.saveOrUpdate(i);
		}catch(Exception ex){
			
		}

	}
	public List<Item> getAllEmpDao(){

		DetachedCriteria criteria = DetachedCriteria.forClass(Item.class);
		
		List<?> results = hibernateTemplate.findByCriteria(criteria);
		if(!results.isEmpty())
		{
			return (List<Item>) results;
		}
		else
		{
			return null;
		}

	}
	public Item getEmpByIdDao(Integer id){

		DetachedCriteria criteria = DetachedCriteria.forClass(Item.class,"Item");
			criteria.add(Restrictions.eq("Item.PId",id));
		List<Item> results = (List<Item>)hibernateTemplate.findByCriteria(criteria);
		Item i=null;
		i=results.get(0);
		if(i!=null)
		{
			return i;
		}
		else
		{
			return null;
		}
	}
	
	@Transactional
	public void deleteItemDao(Integer i){
		try{
		hibernateTemplate.delete(hibernateTemplate.get(Item.class, i));
		}catch(Exception ex){
			
		}
	}
	
	/*public List<Emp> getAllEmpDao(){

		DetachedCriteria criteria = DetachedCriteria.forClass(Emp.class);
		criteria.setFetchMode("address", FetchMode.JOIN);//joining
		
		List<?> results = hibernateTemplate.findByCriteria(criteria);
		if(!results.isEmpty())
		{
			return (List<Emp>) results;
		}
		else
		{
			return null;
		}

	}

	public Emp getEmpByIdDao(Integer id){

		DetachedCriteria criteria = DetachedCriteria.forClass(Emp.class,"EMP");
		criteria.createAlias("EMP.address","ADD");
		criteria.add(Restrictions.eq("EMP.id",id));
		List<Emp> results = (List<Emp>)hibernateTemplate.findByCriteria(criteria);
		Emp e=null;
		e=results.get(0);
		if(e!=null)
		{
			return e;
		}
		else
		{
			return null;
		}
		//System.out.println("In Crud Project");
		//Session session=null;
		Emp e=null;
		session=HbernateUtil.openSession();
		Criteria criteria = session.createCriteria(Emp.class, "EMP")
				.createAlias("EMP.address", "Add")
				.add(Restrictions.eq("EMP.id",id));
				e =(Emp) criteria.list().get(0);
		
		//return e;
		
		
		
	}
	
	public void updateEmpDao(Emp e){
		
	    	Session session=null;
	    	try{
			session=HbernateUtil.openSession();
			session.beginTransaction();
		Query addressQuery = session.createQuery(""
				+ "UPDATE "
				+ "Address "

				+ "SET "						
				+ "city = :city "
				+ "WHERE "
				+ "id = :id ");

		addressQuery.setParameter("city",e.getAddress().getCity())
			.setParameter("id",e.getAddress().getId())
		.executeUpdate();
		
		Query employeeQuery = session.createQuery(""
				+ "UPDATE "
				+ "Emp "

				+ "SET "						
				+ "name = :name, "
				+ "email = :email, "
				+ "address = :address "

				+ "WHERE "
				+ "id = :id ");

		employeeQuery.setParameter("name",e.getName())
		.setParameter("email",e.getEmail())
		.setParameter("address",e.getAddress())
		.setParameter("id",e.getId())
		.executeUpdate();
		session.getTransaction().commit();
		}catch(Exception ex){ex.printStackTrace();
		      session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
*/	
	
}
