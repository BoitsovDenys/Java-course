package ua.training.model.exceptions;

public class NotUniqueLoginException extends RegistrationFormException {
    private String login;

    public String getLoginData() {
        return login;
    }

    public NotUniqueLoginException(String message, String login) {
        super(message);
        this.login = login;
    }
}
