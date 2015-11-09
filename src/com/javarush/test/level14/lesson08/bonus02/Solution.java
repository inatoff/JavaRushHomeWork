package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(r.readLine());
        int b=Integer.parseInt(r.readLine());
        System.out.println(NOD(a, b));

    }
    public static int NOD(int a,int b){
        if (b==0)return a;
        int x=a%b;
        System.out.println(x);
        return NOD(b,x);
    }
}
