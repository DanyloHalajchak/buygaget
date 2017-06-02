package ua.com.buygadget.validation;

import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;

/**
 * Created by user on 31.05.2017.
 */
public interface Validator {

    void validate(Object o) throws UserExeption, GoodsExeption;

}
