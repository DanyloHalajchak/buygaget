package ua.com.buygadget.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Color {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String clorName;
	@OneToMany(mappedBy="color")
	List<Goods> goods;
	
	public Color() {
		super();
	}

	public Color(String clorName) {
		super();
		this.clorName = clorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClorName() {
		return clorName;
	}

	public void setClorName(String clorName) {
		this.clorName = clorName;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}


	@Override
	public String toString() {
		return "Color [id=" + id + ", clorName=" + clorName + ", goods=" + goods + "]";
	}

	

	
	
	
}
