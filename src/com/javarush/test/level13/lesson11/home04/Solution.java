package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        FileWriter fw = new FileWriter(fileName);
        ArrayList<String> list = new ArrayList<String>();
        String s ="";
        while (!s.equals("exit")){
            s=r.readLine();
            list.add(s);
        }
        for (String x:list){
            fw.write(x);
            fw.append(System.getProperty("line.separator"));
        }
        fw.close();
        r.close();
    }
}
