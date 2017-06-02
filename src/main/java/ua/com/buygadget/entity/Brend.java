package ua.com.buygadget.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brend {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nameBrend;
	@OneToMany(mappedBy="brend")
	private List<Goods> goods;
	
	public Brend() {
		super();
	}

	public Brend(String nameBrend) {
		super();
		this.nameBrend = nameBrend;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameBrend() {
		return nameBrend;
	}

	public void setNameBrend(String nameBrend) {
		this.nameBrend = nameBrend;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	

	@Override
	public String toString() {
		return "Brend [id=" + id + ", nameBrend=" + nameBrend + "]";
	}
	
	
	
}
