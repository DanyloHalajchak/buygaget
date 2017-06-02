package ua.com.buygadget.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Posts")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	@Column(length=20000)
	private String text;
	@ManyToMany
	@JoinTable(name="post_tags",joinColumns=@JoinColumn(name="post_id"),inverseJoinColumns=@JoinColumn(name="tag_id"))
	private List<Tag> tags = new ArrayList<>();
	@ManyToMany
	@JoinTable(name="post_goods",joinColumns=@JoinColumn(name="post_id"),inverseJoinColumns=@JoinColumn(name="goods_id"))
	private List<Goods> goods = new ArrayList<>();
	public Post() {
		super();
	}
	public Post(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", text=" + text + ", tags=" + tags + "]";
	}
	
	
}
