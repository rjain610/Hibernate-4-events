package hibernatedto;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 
	  private static SessionFactory sessionFactory;

	
	  protected static SessionFactory newSessionFactory() {
	      Properties properties = new Properties();
	      properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	      //log settings
	      properties.put("hibernate.hbm2ddl.auto", "update");
	      properties.put("hibernate.show_sql", "true");
	      //driver settings
	      properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	      properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernatedb");
	      properties.put("hibernate.connection.username", "root");
	      properties.put("hibernate.connection.password", "root");
	   
	      return new Configuration()
	              .addProperties(properties)
	              .addAnnotatedClass(UserDetails.class)
	              .buildSessionFactory(
	                      new StandardServiceRegistryBuilder()
	                              .applySettings(properties)
	                              .build()
	      );
	  }
	  //Utility method to return SessionFactory
	  public static SessionFactory getSessionFactory() {
		  return newSessionFactory();
	  }
	}
