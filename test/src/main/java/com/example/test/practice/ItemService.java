package com.example.test.practice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService {
     private ArrayList<Item> itemList = new ArrayList<Item>();

    public ItemService() {
        itemList.add(new Item("ICE CREAM", "IT1", 100));
        itemList.add(new Item("TOOTH PASTE", "IT3", 60));
        itemList.add(new Item("COFFEE", "IT2", 170));
        itemList.add(new Item("LATTE AMERICANO", "IT7", 230));
    }

    ArrayList<Item> getAllItems(){
        return itemList;
    }

    Item getSingleItemByID(String id) {
        return itemList.stream().filter(item -> item.getItemId().equals(id)).findFirst().get();
    }

    void addNewItemInList(Item item){
        itemList.add(item);
    }

    void updateItemInList(Item item, String id){
//        System.out.println(item+id);
        for(int i=0 ; i<itemList.size() ; i++) {
            if(itemList.get(i).getItemId().equals(id)){
                itemList.set(i, item);
//                System.out.println(itemList.get(i));
                return;
            }
        }
    }


    void deleteItemInList(String id){
        itemList.removeIf(t -> t.getItemId().equals(id));
    }
}



