package com.dibya.productservice.repository;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dibya.productservice.entity.ProductEntity;
@Repository
public class ProductRepository {
	@Autowired
	private SessionFactory sessionFactory;
	public ProductEntity saveProduct(ProductEntity productEntity)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(productEntity);
		transaction.commit();
		return productEntity;
		
	}
	public Object getProductById(Long id)
	{
		String hqlQuery="from ProductEntity where altKey=:n";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		query.setParameter("n", id);
	 return query.getSingleResult();
	}
	public Object getProductByName(String name)
	{
		String hqlQuery="from ProductEntity where name=:n";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		 query.setParameter("n", name);
		return query.getSingleResult();
		
	}
	public List<ProductEntity> findAllProducts()
	{
		String hqlQuery="from ProductEntity";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		 return query.getResultList();	
	}
	public List<ProductEntity> saveGroupOfProducts(List<ProductEntity> productEntity)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(productEntity);
		transaction.commit();
		return productEntity;
		
		
		
	}
	

}
