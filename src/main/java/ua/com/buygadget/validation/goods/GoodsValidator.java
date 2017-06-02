package ua.com.buygadget.validation.goods;

import org.springframework.stereotype.Component;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.validation.Validator;
import ua.com.buygadget.validation.user.UserExeption;

/**
 * Created by user on 02.06.2017.
 */
@Component
public class GoodsValidator implements Validator {

    @Override
    public void validate(Object o) throws GoodsExeption {
        Goods goods = (Goods) o;

        if(goods.getName().isEmpty()){
            throw new GoodsExeption(GoodsValidationMessage.AMOUST_MOUST_BE_NUMBER);
        }

    }
}
