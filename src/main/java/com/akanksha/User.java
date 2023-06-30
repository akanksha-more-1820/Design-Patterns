package com.akanksha;

public class User {
    //fields
    public String name;

    //methods
    public User(String name){
        this.name=name;
    }

    public void sayHello(){
        System.out.println("Hi my name is "+name);
    }

}
