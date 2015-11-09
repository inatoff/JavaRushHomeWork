package com.javarush.test.level15.lesson12.home04;

/**
 * Created by inatoff on 29.10.2015.
 */
public class Moon implements Planet
{
    private static Moon single;
    private Moon(){}
    public static Moon getInstance(){
        if(single==null){
            single=new Moon();
        }
        return single;
    }
}
