

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(Pencil.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			Student student = new Student();
			
			Pencil pencil = new Pencil();
			
			pencil.setPencilName("Kyle");
			
			Pencil pencil2 = new Pencil();
			
			pencil2.setPencilName("Jenner");
			pencil.setStudent(student);
			pencil2.setStudent(student);
			
			student.setMarks(22);
			student.setName("GoldenBoy");
			student.getPencil().add(pencil);
			student.getPencil().add(pencil2);
			
			session.save(student);
			session.save(pencil);
			session.save(pencil2);
			
			
			session.getTransaction().commit();

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			session.close();
		}

	}

}
