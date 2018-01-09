package hibernatedto;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;


public class MyEventListener implements PostUpdateEventListener  ,PreUpdateEventListener , SaveOrUpdateEventListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void onPostUpdate(PostUpdateEvent arg0) {
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Post update " + ud.toString());
		
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		return false;
	}

	@Override
	public boolean onPreUpdate(PreUpdateEvent arg0) {
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Pre Update " + ud.toString());
		return false;
	}

	@Override
	public void onSaveOrUpdate(SaveOrUpdateEvent arg0) throws HibernateException {
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Save " +  ud.toString());
			
		
	}

	

}
