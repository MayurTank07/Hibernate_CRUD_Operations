package in.starx.hibernatetutorial.HibernateCrudOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.starx.hibernatetutorial.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Employee e1 = new Employee();
    	e1.setEid(102);
    	e1.setEname("chlore");
    	e1.setEsal(88888);
    	e1.setEemail("chlore@gmail.com");
    	e1.setEpassword("chlore@123");
    	e1.setEgender("F");
    	e1.setEcity("Mumbai");
    	
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("in/starx/hibernatetutorial/config/hibernate.cfg.xml");
    	
    	// connect with DB using Session Factory
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	
    	// to interact with DB we create session obj
    	Session session = sessionFactory.openSession();
    	
    	
    	// transaction is used to perform sql queries
    	Transaction transaction = session.beginTransaction();
    	
    	
    	try {
			// write sql queries
    		session.save(e1);
    		transaction.commit();
		} 
    	catch (Exception e) {
    		e.printStackTrace();
    		transaction.rollback();
		}
    	
    
    }
}
