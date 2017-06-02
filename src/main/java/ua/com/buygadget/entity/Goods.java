package ua.com.buygadget.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Goods {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	private int amoust;
	@OneToMany(mappedBy="goods")
	private List<Order> orders;
	@ManyToOne
	private Category category;
	@ManyToOne
	private Brend brend;
	@ManyToOne
	private Color color;
	@ManyToMany
	@JoinTable(name="post_goods",joinColumns=@JoinColumn(name="goods_id"),inverseJoinColumns=@JoinColumn(name="post_id"))
	private List<Post> posts = new ArrayList<Post>();
	public Goods() {
		super();
	}
	public Goods(String name, int price, int amoust) {
		super();
		this.name = name;
		this.price = price;
		this.amoust = amoust;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmoust() {
		return amoust;
	}
	public void setAmoust(int amoust) {
		this.amoust = amoust;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brend getBrend() {
		return brend;
	}
	public void setBrend(Brend brend) {
		this.brend = brend;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", amoust=" + amoust + "]";
	}
	
	
	
	
}
