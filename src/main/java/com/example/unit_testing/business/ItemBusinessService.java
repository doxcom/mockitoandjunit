package com.example.unit_testing.business;

import com.example.unit_testing.model.Item;

public class ItemBusinessService {
    public Item retrieveHardcodedItem() {


        return new Item(1,"Ball", 10,100);

    }
}
