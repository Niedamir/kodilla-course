package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrive() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driveTask = factory.createTask(TaskFactory.DRIVINGTASK);
        driveTask.executeTask();
        //Then
        Assert.assertEquals(true, driveTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaint() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintTask = factory.createTask(TaskFactory.PAINTINGTASK);
        paintTask.executeTask();
        //Then
        Assert.assertEquals(true, paintTask.isTaskExecuted());
    }
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
