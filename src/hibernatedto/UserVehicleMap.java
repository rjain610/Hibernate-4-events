/**
 * 
 */
package hibernatedto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author rahul
 *
 */
@Entity
@Table(name="user_vehicle_map")
public class UserVehicleMap {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne
	(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Vehicles vehicle;
	
	@OneToOne
	(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private UserDetails ud;
	
	
	public UserVehicleMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVehicleMap( Vehicles vehicle, UserDetails ud) {
		super();
		
		this.vehicle = vehicle;
		this.ud = ud;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicles getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicles vehicle) {
		this.vehicle = vehicle;
	}

	public UserDetails getUd() {
		return ud;
	}

	public void setUd(UserDetails ud) {
		this.ud = ud;
	}
	
}
