package NucleusTeq_Week8;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// Add Employees

//		Employee emp1 = new Employee();
//		emp1.setName("Madhur Jatiya");
//		emp1.setEmail("madhur@gmail.com");
//		emp1.setMobile(1234567890L);
//		emp1.setSalary(489545.58);
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Lokesh Nargesh");
//		emp2.setEmail("Lokesh@gmail.com");
//		emp2.setMobile(9321098742L);
//		emp2.setSalary(598955.58);
//		
//		Employee emp3 = new Employee();
//		emp3.setName("Rani Ahire");
//		emp3.setEmail("Rani@gmail.com");
//		emp3.setMobile(7521098742L);
//		emp3.setSalary(428955.58);
//		
//		Employee emp4 = new Employee();
//		emp4.setName("Akshada Pharande");
//		emp4.setEmail("akshu@gmail.com");
//		emp4.setMobile(7221098765L);
//		emp4.setSalary(698955.58);

		// get an Employee

//		Employee employee = session.get(Employee.class, 1);
//		System.out.println(employee);

		// get all Employees

//		ArrayList<Employee> employees = (ArrayList<Employee>) session.createQuery("from Employee").list();
//		for (Employee employee : employees)
//			System.out.println(employee);
		

		// update Employee

			// method 1

//		Employee emp5 = session.get(Employee.class, 6);
//		emp5.setName("Anurag Jain");
//		emp5.setEmail("anurag@gmail.com");
//		emp5.setMobile(9876543213L);
//		emp5.setSalary(398955.50);
//		session.saveOrUpdate(emp5);

		// method 2

//		Query q = session.createQuery("update Employee set name = 'Akash', email = 'akash@gmail.com', mobile = 1234567892L where id = 5");
//		q.executeUpdate();
		
		//delete an employee
		
		Query q = session.createQuery("delete from Employee");

//		session.save(emp1);
//		session.save(emp2);
//		session.save(emp3);
//		session.save(emp4);
		tx.commit();

		sf.close();
		session.close();

	}
}
