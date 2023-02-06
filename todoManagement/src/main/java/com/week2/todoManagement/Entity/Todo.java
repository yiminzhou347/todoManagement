package com.week2.todoManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_todo")
public class Todo {
    @Id
    @Column(name="t_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String taskName;
    private boolean status;
    private int rate;
    private String endDate;

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", status=" + status +
                ", rate=" + rate +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
