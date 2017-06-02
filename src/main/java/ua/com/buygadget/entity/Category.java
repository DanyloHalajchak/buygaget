package ua.com.buygadget.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@NamedQueries({
	@NamedQuery(name="findCategoryWithGoodsById",query="select c from Category c left join fetch c.goods where c.id =:id")
})
@Entity
@Table(name="Categorys")
public class Category {

	@Id
	@GeneratedValue
	(strategy=GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	@OneToMany(mappedBy="category")
	private List<Goods> goods = new ArrayList<Goods>();
	public Category() {
		super();
	}
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", goods=" + goods + "]";
	}
	
	
	
}
