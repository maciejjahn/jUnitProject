package com.junit.classes;

import java.util.ArrayList;
import java.util.List;

public class numberList {
    List<Integer> numbers = new ArrayList<Integer>();


    public void addNumbers(int n){
        numbers.add(n);
    }

    public int getItem(int n){
        return numbers.get(n);
    }


}
