package com.example.demo.domain;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;


public class Shift extends Work{
    @NotBlank(message = "開始時間を入力してください")
    private LocalDateTime startTime;

    @NotBlank(message = "修了時間を入力してください")
    private LocalDateTime endTime;

    private float worktime;

    private float salary;

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setWorkTime(float worktime) {
        this.worktime = worktime;
    }

    public float getWorkTime() {
        return worktime;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }




    

}

