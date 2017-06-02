package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Brend;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class BrendEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String idBrend) throws IllegalArgumentException {

        Brend brend = new Brend();
        brend.setId(Integer.valueOf(idBrend));
        setValue(brend);

    }
}
