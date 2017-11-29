package ua.training;

import java.util.regex.*;

public class Model {

    public static final String SURNAME_REGULAR = "^([ \\u00c0-\\u01ffa-zA-Z'])+$";
    public static final String LOGIN_REGULAR = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$";
    public static final String PHONE_NUMBER_REGULAR = "^[2-9]\\d{2}-\\d{3}-\\d{4}$";
    public static final String EMAIL_REGULAR = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    /**
     * <p>переменная хранит фамилию</p>
     */
    private String userSurname;

    /**
     * <p>переменная хранит логин</p>
     */
    private String userLogin;

    /**
     * <p>переменная хранит email</p>
     */
    private String userEmail;

    /**
     * <p>переменная хранит номер телефона</p>
     */
    private String userPhoneNumber;

    /**
     * <p>проверяет введеную фамилию на правильность</p>
     * @param inputSurname входящая фамилия которую нужно проверить
     * @return true, если фамилия введена правильно, false в противном случае
     */
    public boolean checkSurname(String inputSurname) {
        Pattern pattern = Pattern.compile(SURNAME_REGULAR);
        Matcher matcher = pattern.matcher(inputSurname);
        return matcher.matches();
    }

    /**
     * <p>проверяет входящий логин на правильность</p>
     * @param inputLogin входящий логин
     * @return true, если логин правильный, false в противном случае
     */
    public boolean checkLogin(String inputLogin) {
        Pattern pattern = Pattern.compile(LOGIN_REGULAR);
        Matcher matcher = pattern.matcher(inputLogin);
        for(Logins login : Logins.values()) {
            if(login.toString().equals(inputLogin)) {
                throw new IllegalArgumentException();
            }
        }
        return matcher.matches();
    }

    /**
     * <p>проверяет входящий номер телефона на правильность</p>
     * @param PhoneNumber входящий номер телефона
     * @return true, если номер правильный, false в противном случае
     */
    public boolean checkPhoneNumber(String PhoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGULAR);
        Matcher matcher = pattern.matcher(PhoneNumber);
        return matcher.matches();
    }

    /**
     * <p>проверяет входящую почту на правильность</p>
     * @param inputEmail входящая почта
     * @return true, если почта правильная, false в противном случае
     */
    public boolean checkEmail(String inputEmail) {
        Pattern pattern = Pattern.compile(EMAIL_REGULAR);
        Matcher matcher = pattern.matcher(inputEmail);
        return matcher.matches();
    }

    public void setSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
