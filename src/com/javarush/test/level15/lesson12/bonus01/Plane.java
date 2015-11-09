package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by inatoff on 29.10.2015.
 */
public class Plane implements Flyable
{
    public int passengers;
    public void fly(){};
    public Plane(int passengers){
        this.passengers=passengers;
    }
}
