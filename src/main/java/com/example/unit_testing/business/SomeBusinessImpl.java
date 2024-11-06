package com.example.unit_testing.business;

import com.example.unit_testing.data.SomeDataService;

public class SomeBusinessImpl {


   private SomeDataService someDataService;//el servicio

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }


    public int calculateSum(int [] data){

        int sum = 0;
        for(int value:data){
            sum += value;
        }
        return sum;
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
