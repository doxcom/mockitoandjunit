package com.example.unit_testing.business;

import com.example.unit_testing.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//implementation using mockit mock instead ,and injected mocks annotation
//implementation of the example course was failing,solution was found here:
//https://stackoverflow.com/questions/27065195/null-after-injectmocks
@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockInjectTest {


    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;//we simplify this

    //test were failing after deleting this, solution was let ti and add it MockitoAnnotations
    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSumUsingDataService_basic(){
        //we test directly by using mockito methods
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        assertEquals(6, business.calculateSumUsingDataService());
    }

    //we can altern with another variations of expected results
    //multiple scenarios

    @Test
    public void calculateSumUsingDataService_isEmpty(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        assertEquals(5, business.calculateSumUsingDataService());
    }


}