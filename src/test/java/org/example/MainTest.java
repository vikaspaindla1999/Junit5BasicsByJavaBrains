package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static  Main main;
    @BeforeAll
    public static void init(){
         main= new Main();
    }

    @Test
    void TestCase1() {
        assertEquals(true,main.isPalindrome("madam"));
    }
    @Test
    void TestCase2() {
        //Main main=new Main();
        assertEquals(false,main.isPalindrome("vikas"));
    }

    @Test
    void Testcase3(){
        //Main main=new Main();
        assertEquals(true,main.isPalindrome("malayalam"));
    }

    @AfterAll
    static void successMessage(){
        System.out.print("Successfully executed");
    }


}
