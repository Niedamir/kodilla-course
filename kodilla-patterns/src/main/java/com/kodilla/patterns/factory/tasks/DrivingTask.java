package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;
    boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task: \"" + getTaskName() + "\" (drive to " + getWhere() + " with a " + getUsing() + ") is executed");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getWhere() {
        return where;
    }
    public String getUsing() {
        return using;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
