package hibernatedto;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	  private static StandardServiceRegistry standardServiceRegistry;
	  private static SessionFactory sessionFactory;

	  //private static final Logger logger = LogManager.getLogger(HibernateUtil.class);
	  static{
		  Configuration cfg = new Configuration().configure();
		  sessionFactory = cfg.buildSessionFactory();
	  }
	  //Utility method to return SessionFactory
	  public static SessionFactory getSessionFactory() {
		  return sessionFactory;
	  }
	}
