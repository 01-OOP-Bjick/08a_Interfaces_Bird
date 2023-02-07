package com.cc.java;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        return "I belive I can fly!";
    }

    @Override
    public String hasFeathers() {
        return "I have beautiful feathers!";
    }

}