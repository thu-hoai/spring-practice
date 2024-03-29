package com.example.demo.designpattern.factorymethod;

public class Dog implements Pet {
    private String name;
    private boolean hungry;

    public Dog() {
        super();
        this.hungry = true;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "dog";
    }

    @Override
    public boolean isHungry() {
        return this.hungry;
    }

    @Override
    public void feed() {
        this.hungry = false;
    }
}
