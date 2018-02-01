package com.junit.classes;

public class Employee {
    private String name;
    private String surname;
    private String department;
    private int age;
    private int id;




    public Employee(String name, String surname, String department, int age, int id){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }


    public int getAge(){
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public boolean ageResult(int n){
        boolean result = false;
        if (age >= n)
            result = true;
        return result;
    }
}
