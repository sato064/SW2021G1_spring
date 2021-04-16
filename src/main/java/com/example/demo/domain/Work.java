package com.example.demo.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Work {

    private long id;

    @NotBlank(message = "バイト先の名前を記入してください")
    private String name;

    @Min(value = 0,message = "時給は1円以上を入力してください")
    private int hpay;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void nameId(String name) {
        this.name = name;
    }
    public int getHpay() {
        return hpay;
    }

    public void setHpay(int hpay) {
        this.hpay = hpay;
    }



    
    
}
