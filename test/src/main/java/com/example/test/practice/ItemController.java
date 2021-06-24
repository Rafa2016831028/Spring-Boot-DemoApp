package com.example.test.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    public ArrayList<Item> returnListOfItems(){
        return itemService.getAllItems();
    }

    @RequestMapping("/items/{id}")
    public Item returnItemById(@PathVariable String id){
        return itemService.getSingleItemByID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public void addNewItem(@RequestBody Item item){
        itemService.addNewItemInList(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/items/{id}")
    public void updateItem(@RequestBody Item item,@PathVariable String id){
        itemService.updateItemInList(item,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/items/{id}")
    public void deleteItem(@PathVariable String id){
        itemService.deleteItemInList(id);
    }
}
