package in.starx.hibernatetutorial.HibernateCrudOperations;

import javax.print.attribute.PrintJobAttribute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.starx.hibernatetutorial.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        
//    	Employee e1 = new Employee();
//    	e1.setEname("chlore");
//    	e1.setEsal(88888);
//    	e1.setEemail("chlore@gmail.com");
//    	e1.setEpassword("chlore@123");
//    	e1.setEgender("F");
//    	e1.setEcity("Mumbai");
    	
//    	Employee e2 = new Employee();
//    	e2.setEname("komal");
//    	e2.setEsal(88888);
//    	e2.setEemail("komal@gmail.com");
//    	e2.setEpassword("komal@123");
//    	e2.setEgender("F");
//    	e2.setEcity("Pune");
//    	
//    	Employee e3 = new Employee();
//    	e3.setEname("dexter");
//    	e3.setEsal(99999);
//    	e3.setEemail("dexter@gmail.com");
//    	e3.setEpassword("dexter@123");
//    	e3.setEgender("M");
//    	e3.setEcity("Mumbai");
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("in/starx/hibernatetutorial/config/hibernate.cfg.xml");
    	
    	// connect with DB using Session Factory
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	
    	// to interact with DB we create session obj
    	Session session = sessionFactory.openSession();
    	
    	
    	// transaction is used to perform sql queries
    	Transaction transaction = session.beginTransaction();
    	
    	
// 		-------------- INSERT DATA STARTS --------------------
    	
//    	try {
//			// write sql queries
//    		session.save(e3);
//    		transaction.commit();
//		} 
//    	catch (Exception e) {
//    		e.printStackTrace();
//    		transaction.rollback();
//		}
    	
// 		-------------- INSERT DATA ENDS --------------------
    	
    
// 		-------------- SELECT DATA STARTS --------------------
    	
//    	try 
//    	{
//    		Employee emp = session.get(Employee.class, 2L);
//    		
//    		if(emp == null)
//    		{
//    			System.out.println("Invalid Employee ID");
//    		}
//    		else
//    		{
//    			System.out.println("Emp id : " + emp.getEid());
//        		System.out.println("Emp name : " + emp.getEname());
//        		System.out.println("Emp email : " + emp.getEemail());
//        		System.out.println("Emp password : " + emp.getEpassword());
//        		System.out.println("Emp salary : " + emp.getEsal());
//        		System.out.println("Emp gender : " + emp.getEgender());
//        		System.out.println("Emp city : " + emp.getEcity());
//    		}	
//		} 
//    	catch (Exception e) {
//			e.printStackTrace();
//		}
    	

// 		-------------- SELECT DATA ENDSS --------------------
    	
    	
    	
// 		-------------- UPDATE DATA STARTS --------------------
    	    	
    	
//    	try 
//    	{
//    		Employee emp = session.get(Employee.class, 2L);   // data of eid = 2
//    		
//    		emp.setEcity("Delhi");
//    		
//    		session.saveOrUpdate(emp);
//    		transaction.commit();
//    		
//    	}
//    	catch (Exception e) {
//			e.printStackTrace();
//			transaction.rollback();
//		}
    	
    	
// 		-------------- UPDATE DATA ENDS --------------------
    	
    	  
  
    
// 		-------------- DELETE DATA STARTS --------------------
    	 
    		
    	try
    	{
    		Employee emp = new Employee();
    		emp.setEid(2);
    		
    		session.delete(emp);
    		transaction.commit();
    		System.out.println("EMPLOYEE DATA HAS BEEN DELETED ");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
    	   
// 		-------------- DELETE DATA ENDS --------------------
    	 
	

    	// CRUD -> CREATE , READ, UPDATE, DELETE
    	
    	
    	
   
// 		-------------- hibernate session built-in methods --------------------
    	 	
/*
 		TO PERFROM CRUD OPERATION IN HIBERNATE WE USE MULTIPLE METHODS 
 		
 		-> FOR INSERT OPEATION - 
 			1. save()
 			2. persist()
 
 
 		-> FOR SELECT OPERATION - 
 			1. get()
 			2. load()
 			
 		
 		-> FOR UPDATE OPERATION - 
 			1. update()
 			2. saveOrUpdate()
 			
 		
 		-> FOR DELETE OPERATION
 			1. delete()
 
 */
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
