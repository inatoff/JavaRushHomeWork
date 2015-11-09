package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        r.close();
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader r1 = new BufferedReader(new FileReader(fileName));
        while (r1.ready()){
            int i = Integer.parseInt(r1.readLine());
            if(i%2==0)list.add(i);
        }
        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }

    }
}
