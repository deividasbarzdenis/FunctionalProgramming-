package org.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private  Positions position;
    private String name;
    private List<FeedBack> feedBack = new ArrayList<>();

    public Employee() {
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FeedBack> getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(List<FeedBack> feedBack) {
        this.feedBack = feedBack;
    }

    @Override
    public String toString() {
        return position + ", " + name;
    }
}
