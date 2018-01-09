/**
 * 
 */
package hibernatedto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author rahul
 *
 */
public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		
		
		SessionFactory session = HibernateUtil.getSessionFactory();
		
		Session sess =session.openSession();
		Transaction tx = sess.beginTransaction();
		UserDetails ud = new UserDetails();
		ud.setUserName("Test listener2");
		Integer id = (Integer) sess.save(ud);
		tx.commit();
		sess.close();
		
		 sess =session.openSession();
		  tx = sess.beginTransaction();
		  ud = (UserDetails) sess.load(UserDetails.class, id);
		  ud.setUserName("@");
		  sess.update(ud);
		  tx.commit();
		  sess.close();
		  session.close();
		 
		
		
	}

}
