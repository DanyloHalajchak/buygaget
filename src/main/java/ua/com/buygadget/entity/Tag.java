package ua.com.buygadget.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tags")
public class Tag {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String tagName;
	@ManyToMany
	@JoinTable(name="post_tags",joinColumns=@JoinColumn(name="tag_id"),inverseJoinColumns=@JoinColumn(name="post_id"))
	private List<Post> posts = new ArrayList<>();
	public Tag() {

	}
	public Tag(String tagName) {
		super();
		this.tagName = tagName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagName=" + tagName + "]";
	}

	
	
}
