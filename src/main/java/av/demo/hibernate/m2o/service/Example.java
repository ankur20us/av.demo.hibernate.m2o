package av.demo.hibernate.m2o.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import av.demo.hibernate.m2o.modal.Customer;
import av.demo.hibernate.m2o.modal.Vendor;

public class Example {

	public static void main(String[] args) {
		
		SessionFactory factory = null;
		Session session = null;
		
		try {
			
			Configuration 	cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			System.out.println("hello");	

			factory = cfg.buildSessionFactory();
			session = factory.openSession();
			Transaction tx = null;
			
			int vendorId = 101;
			
			/***
			 * AV:
			 * 		Inserting the object
			 */
			tx = session.beginTransaction();
			
			Vendor v =new Vendor();
				v.setVendorId(vendorId);
	            v.setVendorName("java4s");
	           
            Customer c1 = new Customer(101, "Ankur 101", v);
            Customer c2 = new Customer(102, "Ankur 102", v);
            Customer c3 = new Customer(103, "Ankur 103", v);
	        
            session.save(c1);
    		session.save(c2);
    		session.save(c3);
    		
    		tx.commit();
    		
    		
    		/***
			 * AV:
			 * 		Selecting the parent with all the child
			 */
    		Query qry = session.createQuery("from Customer c where c.v.vendorId=(:vendorId)");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(session != null){
				session.close();
			}
			if(factory != null){
				factory.close();				
			}
		}
	}
	
}
