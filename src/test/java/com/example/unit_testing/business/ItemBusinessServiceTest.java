package com.example.unit_testing.business;

import com.example.unit_testing.data.ItemRepository;
import com.example.unit_testing.data.SomeDataService;
import com.example.unit_testing.model.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//implementation using mockit mock instead of stub ...
//for injected mocks check the Class-> SomeBusinessMockInjectTest
@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

  @InjectMocks
  private ItemBusinessService business;

  @Mock
  private ItemRepository repository;

    @Test
    public void calculateSumUsingDataService_basic(){
        //we test directly by using mockito methods
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",10,10),
                new Item(3,"Item3",20,20)));
        List<Item> items = business.retrieveAllItems();
        //business logic:
        //  item.setValue(item.getPrice()*item.getQuantity());
        assertEquals(100, items.get(0).getValue());
        assertEquals(400, items.get(1).getValue());
    }
}