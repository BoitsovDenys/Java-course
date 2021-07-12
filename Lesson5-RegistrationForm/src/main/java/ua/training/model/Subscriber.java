package ua.training.model;

import ua.training.model.exceptions.NotUniqueLoginException;

public class Subscriber {
    private String firstName;
    private String login;

    public Subscriber() {
    }

    public Subscriber(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLogin(String login) throws NotUniqueLoginException {
        for (DBNotebook subscriber : DBNotebook.values()) {
            if (subscriber.getLogin().equals(login)) {
                throw new NotUniqueLoginException("Not Unique Login", login);
            }
        }
        this.login = login;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
