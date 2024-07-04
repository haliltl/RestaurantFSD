package com.humber.Assignment12.service;

import com.humber.Assignment12.model.Item;
import com.humber.Assignment12.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public Page<Item> getAllItems(Pageable pageable) {
        return itemRepository.findAll(pageable);
    }

    public List<Item> findByBrandAndYear(String brand, int year) {
        return itemRepository.findByBrandAndYear(brand, year);
    }
}
