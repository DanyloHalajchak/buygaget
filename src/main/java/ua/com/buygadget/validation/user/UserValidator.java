package ua.com.buygadget.validation.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.buygadget.dao.UsersDao;
import ua.com.buygadget.entity.User;
import ua.com.buygadget.validation.Validator;


/**
 * Created by user on 31.05.2017.
 */
@Component
public class UserValidator implements Validator {

    @Autowired
    private UsersDao usersDao;

    @Override
    public void validate(Object o) throws UserExeption {
        User user = (User) o;
        if(user.getName().isEmpty()){
            throw new UserExeption(UserValidationMessage.NAME_IS_EMPTY);
        }else if(user.getSeName().isEmpty()){
            throw new UserExeption(UserValidationMessage.SENAME_IS_EMPTY);
        }else if(user.getAge() == 0){
            throw new UserExeption(UserValidationMessage.AGE_IS_EMPTY);
        }else if(user.getLogin().isEmpty()){
            throw new UserExeption(UserValidationMessage.LOGIN_IS_EMPTY);
        } else if(user.getEmail().isEmpty()){
            throw new UserExeption(UserValidationMessage.EMAIL_IS_EMPTY);
        }else if(!user.getEmail().matches( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new UserExeption(UserValidationMessage.WRONG_EMAIL);
        }else if(user.getPassword().isEmpty()){
            throw new UserExeption(UserValidationMessage.PASSWORD_IS_EMPTY);
        }else if(user.getPassword().length() < 8){
            throw new UserExeption(UserValidationMessage.PASSWORD_LEIGHT);
        }else if(user.getPassword().matches(user.getPassword().charAt(0)+"+")){
            throw new UserExeption(UserValidationMessage.PASSWORD_REPEATE);
        }



    }


//    public boolean repete(){
//
//         Pattern pattern;
//         Matcher matcher;
//        pattern = Pattern.compile(IPADDRESS_PATTERN);
//    }
}
