package com.fndong.customer;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.fndong.customer.Customer;
import com.fndong.customer.Order;


public class OneToManyTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
 /*       // 1) First Table  - Customer
        Customer customer = new Customer();
        customer.setCity("Kuala Lumpur");
        customer.setCountry("Malaysia");
        customer.setEmail("frank@gmail.com");
        customer.setFirstname("fndong");
        customer.setLastname("franko");
    
        // 2) Second Table - Order
        Order order = new Order();
        order.setDate(new Date());
        order.setOrderDate(new Date());
        order.setPaid(new Float("30.0"));
        order.setTotalPrice(new Float("30.0"));
        
        order.setCustomer(customer);        
        customer.getOrders().add(order);

        session.save(customer);*/

       
         // 3. View the Record from one to Many
        @SuppressWarnings("unchecked")
		List<Customer> customerList = session.createQuery("from Customer").list();
        for (Customer custView : customerList) {
        	System.out.println(" First Name :  " + custView.getFirstname());
        	System.out.println(" First Name :  " + custView.getLastname());
        	System.out.println(" Email :  " + custView.getEmail());
        
 
        session.getTransaction().commit();
        session.close();
	}
	}

}
