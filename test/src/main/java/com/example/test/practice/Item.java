package com.example.test.practice;

import javax.persistence.Entity;

//@Entity
public class Item {
    private String name;
    private String itemId;
    private int price;

    public Item(String name, String itemId, int price) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
