package com.junit.classes;

public class Subtraction {
    final int number = 4;

    public boolean subResult(int n, int m){
        boolean result = true;
        if(n - m == number)
            result = false;
        return result;
    }


}
