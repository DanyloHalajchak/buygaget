package ua.com.buygadget.editors;

import ua.com.buygadget.entity.Goods;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 30.05.2017.
 */
public class GoodsEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String idGoods) throws IllegalArgumentException {

        Goods goods =new Goods();
        goods.setId(Integer.valueOf(idGoods));
        setValue(goods);

    }
}
