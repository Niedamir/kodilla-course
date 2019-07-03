package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting Task: \"" + getTaskName() + "\" (paint " + getWhatToPaint() + " with color: " + getColor() + ") is executed");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getColor() {
        return color;
    }
    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
