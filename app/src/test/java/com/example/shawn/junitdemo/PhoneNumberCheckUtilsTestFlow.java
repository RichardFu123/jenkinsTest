package com.example.shawn.junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberCheckUtilsTestFlow {

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void setUpAfterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");

    }

    @Test
    public void isPhoneLegal() {
        System.out.println("isP");

    }

    @Test
    public void isChinaPhoneLegal() {
        System.out.println("isCP");

    }

    @Test
    public void isHKPhoneLegal() {
        System.out.println("isHKP");
    }
}