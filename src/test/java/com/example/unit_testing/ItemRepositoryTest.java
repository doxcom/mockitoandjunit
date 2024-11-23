package com.example.unit_testing;

import com.example.unit_testing.data.ItemRepository;
import com.example.unit_testing.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;


    @Test
    public void testfindAll() {

        List<Item> items = repository.findAll();
        assertEquals(4,items.size());

    }
}
