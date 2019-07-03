package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "Driving task";
    public static final String PAINTINGTASK = "Painting task";
    public static final String SHOPPINGTASK = "Shopping task";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "home", "taxi");
            case PAINTINGTASK:
                return new PaintingTask("Paint task", "blue", "walls");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "onions", 4);
            default:
                return null;
        }

    }
}
