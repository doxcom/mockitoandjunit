package com.example.unit_testing.business;

import com.example.unit_testing.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    //restful service

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1,"Ball", 10,100); //response in a json format
    }

}
