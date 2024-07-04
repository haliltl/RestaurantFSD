package com.humber.Assignment12.controller;

import com.humber.Assignment12.model.Item;
import com.humber.Assignment12.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items/new")
    public String showAddItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "addItem";
    }

    @PostMapping("/items")
    public String addItem(@Valid Item item, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addItem";
        }
        itemService.saveItem(item);
        return "redirect:/items";
    }

    @GetMapping("/items")
    public String listItems(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "7") int size, @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Item> itemPage = itemService.getAllItems(pageable);
        model.addAttribute("itemPage", itemPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("pageSize", size);
        model.addAttribute("sortBy", sortBy);
        return "itemList";
    }

    @GetMapping("/items/sortByBrand")
    public String sortByBrand(Model model) {
        List<Item> items = itemService.findByBrandAndYear("Dior", 2022);
        model.addAttribute("items", items);
        return "itemList";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
