package com.example.unit_testing.data;

import com.example.unit_testing.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

//web layer is the controller, bussiness layer is the bussiness service, data layer is the repository


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
