package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by inatoff on 29.10.2015.
 */
public abstract class DrinkMaker implements Runnable
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
