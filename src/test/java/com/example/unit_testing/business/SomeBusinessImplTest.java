package com.example.unit_testing.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    public void calculateSum_basic(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        //use one of the functions of the class component and compare with assertEquals
        int actualResult = business.calculateSum(new int [] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    //we can altern with another variations of expected results
    //multiple scenarios

    @Test
    public void calculateSum_isEmpty(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        //quitando algunos numeros del arreglo de la funcion
        int actualResult = business.calculateSum(new int [] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        //quitando algunos numeros del arreglo de la funcion
        int actualResult = business.calculateSum(new int [] {1});
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }



}