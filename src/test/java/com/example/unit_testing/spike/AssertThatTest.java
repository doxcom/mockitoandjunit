package com.example.unit_testing.spike;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertThatTest {

    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12,15,45);
           //chaining conditions instead of parameters                //all match with lambda expression
       assertThat(numbers).hasSize(3).contains(12,15).allMatch(x -> x > 10);


    }
}
