package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Category;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class CategoryEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String idCategory) throws IllegalArgumentException {

        Category category = new Category();
        category.setId(Integer.valueOf(idCategory));
        setValue(category);

    }
}
