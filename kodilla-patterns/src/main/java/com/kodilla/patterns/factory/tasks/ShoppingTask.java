package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task: \"" + getTaskName() + "\" (buy " + getQuantity() + " " + getWhatToBuy() + ") is executed");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getWhatToBuy() {
        return whatToBuy;
    }
    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
