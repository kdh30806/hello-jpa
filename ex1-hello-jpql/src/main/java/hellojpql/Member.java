package hellojpql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Member {
	
	@Id @GeneratedValue
	private Long id;
	private String username;
	private int age;
	
	
	@ManyToOne
	@JoinColumn(name = "TEAM_ID")
	private Team team;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getusername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setusername(String username) {
		this.username = username;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
