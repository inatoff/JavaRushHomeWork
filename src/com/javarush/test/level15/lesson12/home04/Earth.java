package com.javarush.test.level15.lesson12.home04;

/**
 * Created by inatoff on 29.10.2015.
 */
public class Earth implements Planet
{
    private static Earth single;
    private Earth(){}
    public static Earth getInstance(){
        if(single==null){
            single=new Earth();
        }
        return single;
    }
}
