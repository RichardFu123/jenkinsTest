package com.example.shawn.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberCheckUtilsTest {
    String pN1="13518097041";
    String pN2="1351809704111112";
    String pN3="83749658";

    @Test
    public void isPhoneLegal() {
        assertTrue(PhoneNumberCheckUtils.isPhoneLegal(pN1));
    }

    @Test
    public void isChinaPhoneLegal(){
        assertFalse(PhoneNumberCheckUtils.isChinaPhoneLegal(pN2));
    }

    @Test
    public void isHKPhoneLegal(){
        assertTrue(PhoneNumberCheckUtils.isHKPhoneLegal(pN3));
    }
}