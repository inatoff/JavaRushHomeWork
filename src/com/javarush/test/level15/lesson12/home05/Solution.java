package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public Solution(){}
    public Solution(int a){}
    public Solution(double a){}
    private Solution(float a){}
    private Solution(short a){}
    private Solution(byte a){}
    protected Solution(String a){}
    protected Solution(boolean a){}
    protected Solution(BigInteger a){}
    Solution(BigDecimal a){}
    Solution(Double a){}
    Solution(Integer a){}
}