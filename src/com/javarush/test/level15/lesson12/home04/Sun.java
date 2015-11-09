package com.javarush.test.level15.lesson12.home04;

/**
 * Created by inatoff on 29.10.2015.
 */
public class Sun implements Planet
{
    private static Sun single;
    private Sun(){}
    public static Sun getInstance(){
        if(single==null){
            single=new Sun();
        }
        return single;
    }
}
