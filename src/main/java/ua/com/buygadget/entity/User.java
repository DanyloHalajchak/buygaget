package ua.com.buygadget.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String seName;
	private int age;
	@Column(unique=true)
	private String login;
	@Column(unique=true)
	private String email;
	private String password;
	@OneToMany(mappedBy="user")
	private List<Order> orders;
	public User() {
		super();
	}
	public User(String name, String seName, int age, String login, String email, String password) {
		super();
		this.name = name;
		this.seName = seName;
		this.age = age;
		this.login = login;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeName() {
		return seName;
	}
	public void setSeName(String seName) {
		this.seName = seName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
