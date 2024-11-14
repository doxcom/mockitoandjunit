package com.example.unit_testing.business;

import com.example.unit_testing.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {


    @Autowired
    ItemBusinessService businessService;
    //restful service

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1,"Ball", 10,100); //response in a json format
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        return businessService.retrieveHardcodedItem(); //response in a json format
    }

}
