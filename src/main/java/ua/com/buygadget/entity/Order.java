package ua.com.buygadget.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int amoust;
	private String data;
	private int totalPrice;
	@ManyToOne
	private Goods goods;
	@ManyToOne
	private User user;
	public Order() {
		super();
	}
	public Order(int amoust, String data, int totalPrice) {
		super();
		this.amoust = amoust;
		this.data = data;
		this.totalPrice = totalPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmoust() {
		return amoust;
	}
	public void setAmoust(int amoust) {
		this.amoust = amoust;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
}
