import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUtils;
import com.models.Employe;

public class Main {

	public static void main(String[] args) {

		Session s = HibernateUtils.getSessionFactory().getCurrentSession();

		Transaction t = s.beginTransaction();
		
		Employe e = new Employe();
		e.setId(1);
		e.setNom("NHibernate_TestNom");
		e.setAddress("NHibernate_TestAddress");
		e.setTel("NHibernate_TestTel");
		
		s.remove(e);
		
		t.commit();
		s.close();

	}

}
