package hibernatedto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicles")
public class Vehicles {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	private String vname;
	
	@OneToOne
	@JoinColumn(name="vid",referencedColumnName="vehid")
	private UserVehicleMap uvmap;
	
	
	public Vehicles(String vname, UserVehicleMap uvmap) {
		super();
		
		this.vname = vname;
		this.uvmap = uvmap;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public UserVehicleMap getUvmap() {
		return uvmap;
	}
	public void setUvmap(UserVehicleMap uvmap) {
		this.uvmap = uvmap;
	} 
	

}
