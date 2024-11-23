package com.example.unit_testing.business;

import com.example.unit_testing.data.SomeDataService;

import java.util.Arrays;

public class SomeBusinessImplFunctional {


   private SomeDataService someDataService;//el servicio

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    //using optional function(olElse(0), and Array stream and reduce to fit all numbers we convert this function in a functional programming
    public int calculateSum(int [] data){

       // int sum = 0;
       // for(int value:data){
        //    sum += value;
       // }
       // return sum;


        //  ----->instead of using for each:
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }
    //usando un servicio no pasa los datos por parametro si no los obtiene dentro
    //pero declarando un objeto del servicio en esta misma clase
    public int calculateSumUsingDataService(){

        int sum = 0;
        int [] data= someDataService.retrieveAllData();
        for(int value:data){
            sum += value;
        }
        return sum;
    }
}
