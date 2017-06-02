package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Tag;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class TagsEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String idTags) throws IllegalArgumentException {

        Tag tag = new Tag();
        tag.setId(Integer.valueOf(idTags));
        setValue(tag);

    }
}
