package ua.com.buygadget.servicelmpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.GoodsDao;
import ua.com.buygadget.dao.PostDao;
import ua.com.buygadget.dao.TagsDao;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.entity.Post;
import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.service.PostService;

@Service
public class PostServicelmpl implements PostService{

	@Autowired
	private PostDao postDao;
	@Autowired
	private TagsDao tagsDao;
	@Autowired
	private GoodsDao goodsDao;

	//Using @RequestParam (Many-to-many)
//	public void save(Post post,List<Integer> tags,List<Integer> goods) {
//
//
//		List<Tag> integers = new ArrayList<>();
//		List<Goods> goods1 = new ArrayList<>();
//		postDao.saveAndFlush(post);
//		for (Integer integer : tags) {
//			integers.add(tagsDao.getOne(integer));
//
//		}
//		for (Tag tag : integers) {
//			post.getTags().add(tag);
//		}
//
//		for(Integer integer : goods){
//
//			goods1.add(goodsDao.getOne(integer));
//
//		}
//		for (Goods goods2 : goods1) {
//			post.getGoods().add(goods2);
//		}
//		postDao.save(post);
//
//
//	}

	//Using @ModelAtribute
	@Override
	public void save(Post post) {
		postDao.save(post);
	}

	public List<Post> getAll() {
		List<Post> post = postDao.findAll();
		return post;
	}

	public Post getForId(int id) {
		Post post = postDao.getOne(id);
		return post;
	}

	public void update(Post post) {
		postDao.save(post);
		
	}

	public void delet(int id) {
		postDao.delete(id);
		
	}



	@Override
	public List<Post>  findAllPostsWithTags() {
		return postDao.findAllPostsWithTags();
		
	}

    @Override

    public List<Post> finAllPostWithGoodsAndTags() {

        List<Post> postsWithTags = postDao.findAllPostsWithTags();
        Collections.sort(postsWithTags,(o1, o2) -> o1.getId() - o2.getId());
        List<Post> postsWithGoods = postDao.findAllPostsWithGoods();
        Collections.sort(postsWithGoods,(o1, o2) -> o1.getId() - o2.getId());
//        for (Post post: postsWithGoods
//                )
//            System.out.println(post.getTitle());{
//
//        }
//        System.out.println("--------------");
        int i = 0;
        for (Post post : postsWithTags) {
            System.out.println(postsWithGoods.get(i).getTitle());
            System.out.println(post.getTitle());
            postsWithGoods.get(i).setTags(post.getTags());
            i++;
        }
//        for (Post post: postsWithTags
//             )
//            System.out.println(post.getTitle());{
//
//        }
//        System.out.println("--------------");
//        for (Post post: postsWithGoods
//                )
//            System.out.println(post.getTitle());{
//
//        }
        return postsWithGoods;
    }


}
