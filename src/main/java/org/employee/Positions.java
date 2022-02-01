package org.employee;

public enum Positions {
    ProjectManager("Project manager"),
    JuniorDeveloper("Junior developer"),
    MidDeveloper("Mid developer"),
    SeniorDeveloper("Senior developer");

    public final String position;

    Positions(String position) {
        this.position = position;
    }
}
