package hibernatedto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="user_details")
public class UserDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String userName;
	@OneToOne
	@JoinColumn(name="userid",referencedColumnName="uid")
	private UserVehicleMap uvmap;
	
	
	public UserDetails() {

	}
	
	public UserDetails( String userName, UserVehicleMap uvmap) {
		super();
		
		this.userName = userName;
		this.uvmap = uvmap;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserVehicleMap getUvmap() {
		return uvmap;
	}
	public void setUvmap(UserVehicleMap uvmap) {
		this.uvmap = uvmap;
	}

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", userName=" + userName + ", uvmap=" + uvmap + "]";
	}
	

	
	

}
