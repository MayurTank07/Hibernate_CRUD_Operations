package in.starx.hibernatetutorial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// annotation -> @
@Entity
public class Employee {

	@Id
	@Column
	private int eid;
	
	@Column
	private String ename;
	
	@Column
	private double esal;
	
	@Column
	private String eemail;
	
	@Column
	private String epassword;
	
	@Column
	private String egender;
	
	@Column
	private String ecity;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}
	public String getEgender() {
		return egender;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
}
