package ua.training.model;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Subscriber> subscribersList = new ArrayList<>();

    public ArrayList<Subscriber> getSubscribersList() {
        return subscribersList;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }
}
