package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Order;
import ua.com.buygadget.entity.Post;

public interface PostService {

// using @RequestParam
//	void save(Post post, List<Integer> tags,List<Integer> goods);

	// using @ModelAtribute
	void save(Post post);

	List<Post> getAll();

	Post getForId(int id);

	void update(Post post);

	void delet(int id);
	
	List<Post> findAllPostsWithTags();

	List<Post> finAllPostWithGoodsAndTags();


}
