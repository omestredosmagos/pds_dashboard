package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table
public class NumeroPosts {
	@Id
	private int userid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private int numberposts;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getNumberposts() {
		return numberposts;
	}

	public void setNumberposts(int numberposts) {
		this.numberposts = numberposts;
	}
	
}
