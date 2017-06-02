package ua.com.buygadget.validation.user;

/**
 * Created by user on 31.05.2017.
 */
public interface  UserValidationMessage {
    //Name
    String NAME_IS_EMPTY = "PLEASE, WRITE YOUR NAME";

    //seName
    String SENAME_IS_EMPTY = "PLEASE, WRITE YOUR seNAME";
    //age
    String AGE_IS_EMPTY = "PLEASE, WRITE YOUR AGE";
    String AGE_IS_NOUMBER = "AGE SHOULD CONSIST OF NUMBER";
    //login
    String LOGIN_IS_EMPTY = "PLEASE, WRITE YOUR LOGIN";
    String LOGIN_IS_ALREADY_USED = "YOUR LOGIN ALREADY IS USED";
    //email
    String EMAIL_IS_EMPTY = "PLEASE, WRITE YOUR EMAIL";
    String WRONG_EMAIL = "WRONG EMAIL";
    //password
    String PASSWORD_IS_EMPTY = "PLEASE, WRITE YOUR PASSWORD";
    String PASSWORD_LEIGHT = "PASSWORD LIGHT MUST BE MIN. 8";
    String PASSWORD_MUST_HAVE_ONE_BIG_LETERS = "PASSWORD MOUST HAVE ONE BIG LETER";
    String PASSWORD_REPEATE = "PASSWORD NOT MUST REPETE";

}
