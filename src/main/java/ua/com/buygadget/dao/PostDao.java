package ua.com.buygadget.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.entity.Post;

public interface PostDao  extends JpaRepository <Post, Integer>{

	@Query("select distinct p from Post p left join fetch p.tags")
	List<Post> findAllPostsWithTags();

	@Query("select distinct p from Post  p left join fetch p.goods")
	List<Post> findAllPostsWithGoods();

	
}
