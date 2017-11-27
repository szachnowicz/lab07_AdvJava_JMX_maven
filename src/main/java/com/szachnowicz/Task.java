package com.szachnowicz;

import java.util.Random;

public class Task {

    private static final int RANGE = 5;
    private int taskPrority;
    private int taskNo;
    private boolean finish;

    public int getTaskPrority() {
        return taskPrority;
    }

    public int getTaskNo() {
        return taskNo;
    }

    public Task(int taskNo) {
        this.taskPrority = new Random().nextInt(RANGE);
        this.taskNo = taskNo;

    }

    public void setTaskPrority(int taskPrority) {
        this.taskPrority = taskPrority;
    }

    public void setTaskNo(int taskNo) {

        this.taskNo = taskNo;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public boolean isFinish() {
        return finish;
    }
}
