package com.example.unit_testing.business;

import com.example.unit_testing.data.ItemRepository;
import com.example.unit_testing.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBusinessService {

    @Autowired
    private ItemRepository repository;


    public Item retrieveHardcodedItem() {
        return new Item(1,"Ball", 10,100);

    }

    public List<Item> retrieveAllItems() {
        List<Item> items = repository.findAll();
        for(Item item:items){
            item.setValue(item.getPrice()*item.getQuantity());
        }

        return items;
       // repository.
    }
}
