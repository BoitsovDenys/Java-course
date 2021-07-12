package ua.training.model;

public enum DBNotebook {
    SUBSCRIBER_ONE ("Mike", "mike12345"),
    SUBSCRIBER_TWO ("Igor", "igor12345"),
    SUBSCRIBER_THREE ("Alex", "alex12345");

    private final String firstName;
    private final String login;

    DBNotebook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String subscriberLogin) {
        for (DBNotebook subscriber : DBNotebook.values()){
            if (subscriber.getLogin().equals(subscriberLogin)) {
                return true;
            }
        }
        return false;
    }
}
