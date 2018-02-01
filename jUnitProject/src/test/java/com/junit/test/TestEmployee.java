package com.junit.test;

import com.junit.classes.Employee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEmployee {
    Employee employee;

    @Before
    public void TestEmployee(){
        employee = new Employee("John", "Smith", "IT",18, 12345);
    }

    @Test
    public void checkEmployee(){
        assertEquals(employee.getName(),"John");
        assertEquals(employee.getSurname(),"Smith");
        assertEquals(employee.getDepartment(),"IT");
        assertEquals(employee.getAge(),18);
        assertEquals(employee.getId(),12345);

    }

    @Test
    public void checkIfNull(){
        assertNull(employee);
    }


    @Test
    public void checkAge(){
        assertTrue(employee.ageResult(18));
    }

    @Test
    public void checkIfSameReference(){
        assertSame(employee.getName(),employee.getAge());
    }

    @Test
    public void isNotSame(){
        assertNotSame(employee.getAge(),employee.getId());
    }
}
