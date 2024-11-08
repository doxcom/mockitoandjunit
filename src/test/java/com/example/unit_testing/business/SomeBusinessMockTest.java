package com.example.unit_testing.business;

import com.example.unit_testing.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//implementation using mockit mock instead of stub ...

class SomeBusinessMockTest {

    @Test
    public void calculateSumUsingDataService_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        //we need to create a mock from a service
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        //we test directly by using mockito methods
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        business.setSomeDataService(dataServiceMock);//this stub is calling from line 8
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
        SomeDataService dataServiceMockEmpty = mock(SomeDataService.class);
        when(dataServiceMockEmpty.retrieveAllData()).thenReturn(new int[] {});
        business.setSomeDataService(dataServiceMockEmpty);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        //we declare the class component to test
        SomeBusinessImpl business = new SomeBusinessImpl();
        SomeDataService dataServiceMockOne = mock(SomeDataService.class);
        when(dataServiceMockOne.retrieveAllData()).thenReturn(new int[] {1});
        business.setSomeDataService(dataServiceMockOne);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }


}