package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by inatoff on 28.10.2015.
 */
public class Singleton
{
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance()
    {
        return ourInstance;
    }

    private Singleton()
    {
    }
}
