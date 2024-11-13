package com.example.unit_testing.business;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ListMockTest {

    List<String> mock = mock(List.class);

    @Test
    public void size_basic(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());
    }


    @Test
    public void returnDifferentValues(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,mock.size());
        assertEquals(10,mock.size());

    }


    @Test
    public void returnWithParameters(){
        when(mock.get(0)).thenReturn("in28minutes");
        assertEquals("in28minutes",mock.get(0));
        assertEquals(null,mock.get(1));
    }


    @Test
    public void returnWithGenericParameters(){
        when(mock.get(anyInt())).thenReturn("in28minutes");
        assertEquals("in28minutes",mock.get(0));
        assertEquals("in28minutes",mock.get(1));
    }


    @Test
    public void verificationBasics(){
        //for scenarios when value is not return back
        //sut
        String value = mock.get(0);

        //verify
        verify(mock).get(0);
        verify(mock).get(anyInt());
        //verify is call one time
        verify(mock, times(1)).get(anyInt());
        verify(mock, atLeast(1)).get(anyInt());
        verify(mock, atMost(2)).get(anyInt());
        verify(mock, never()).get(2);
    }

    @Test
    public void argumentCapturing(){
        //system under test
        mock.add("SomeString");//argument capture

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

       assertEquals("SomeString",captor.getValue());
    }

    @Test
    public void argumentCapturingMultipleTimes(){
        //system under test
        mock.add("SomeString1");//argument capture
        mock.add("SomeString2");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock,times(2)).add(captor.capture());

        List<String> allValues = captor.getAllValues();
        assertEquals("SomeString1",allValues.get(0));
        assertEquals("SomeString2",allValues.get(1));



    }
}
