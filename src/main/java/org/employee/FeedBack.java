package org.employee;

import java.util.List;

public abstract class FeedBack {
    private Employee employee;
    private String comment;
    private Like like;

    public FeedBack() {
    }

    public abstract void writeCommentsToFile(FeedBack feedBack, String fileName);
    public abstract List<Comment> getEmployeesComments(String commentsFile);
    public abstract List<Comment> getEmployeeComments(String name, String commentFile);
    public abstract Comment findComment(String[] arr);

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return employee.getName() + ", " + comment + ", " + like;
    }

    public enum Like {
        Good, Bad, Average;
    }
}
