package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Post;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class PostEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        Post post = new Post();
        post.setId(Integer.valueOf(text));
        setValue(post);

    }
}
