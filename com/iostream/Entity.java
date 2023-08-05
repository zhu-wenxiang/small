package com.iostream;

import java.io.Serializable;

public class Entity implements Serializable{
    
    private static final long serialUID=1111L;

    private static int total=1;
    private int number;

    private int age;
    private String name;
    private int myID;

    public Entity(int num,int age,String name){
        myID=total++;
        this.number=num;
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Entity{"+this.number+"年龄："+this.age+this.name+this.myID+"}";
    }
}
