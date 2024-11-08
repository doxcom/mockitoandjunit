package com.example.unit_testing.business;

import com.example.unit_testing.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}


class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());//this stub is calling from line 8
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    //we can altern with another variations of expected results
    //multiple scenarios

    @Test
    public void calculateSumUsingDataService_isEmpty(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSum(new int [] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSum(new int [] {1});
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }



}