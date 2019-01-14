package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class QuantidadeLogin {
	@Id
	private int userid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private int qtdlogin;

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

	public int getQtdLogin() {
		return qtdlogin;
	}

	public void setQtdLogin(int qtdlogin) {
		this.qtdlogin = qtdlogin;
	}
	
}
