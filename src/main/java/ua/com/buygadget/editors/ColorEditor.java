package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Color;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class ColorEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String idColors) throws IllegalArgumentException {

        Color color = new Color();
        color.setId(Integer.valueOf(idColors));

        setValue(color);

    }
}
