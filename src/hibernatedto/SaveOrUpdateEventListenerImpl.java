package hibernatedto;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class SaveOrUpdateEventListenerImpl implements PostUpdateEventListener  ,PreUpdateEventListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void onPostUpdate(PostUpdateEvent arg0) {
		System.out.println("Hell");
		
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		System.out.println("Yeag");
		return false;
	}

	@Override
	public boolean onPreUpdate(PreUpdateEvent arg0) {
		System.out.println("Pre");
		return false;
	}

	

}
