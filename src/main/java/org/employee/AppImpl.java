package org.employee;

public class AppImpl implements App{
    public static void main(String[] args) {
    App app = new AppImpl("employeeFile.csv", "commentsFile.csv");
    app.run();
    }

    private final String employeeFile;
    private final String commentsFile;

    public AppImpl(String employeeFile, String commentsFile) {
        this.employeeFile = employeeFile;
        this.commentsFile = commentsFile;
    }

    @Override
    public void run() {
        login();
    }

    @Override
    public void login() {
        runMainApp();
    }

    @Override
    public boolean runMainApp() {
        return false;
    }
}
