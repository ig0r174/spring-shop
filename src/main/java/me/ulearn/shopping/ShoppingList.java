package me.ulearn.shopping;

import me.ulearn.shopping.model.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ShoppingList {
    private static final HashMap<Integer, Product> ProductList = new LinkedHashMap<>();
    private static int nextId = 1;
    private String name;
    private final int id;

    public ShoppingList(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void add(String text){
        ProductList.put(nextId, new Product(nextId, text));
        nextId++;
    }

    public static void add(Product item){
        ProductList.put(nextId++, item);
    }

    public static void remove(int id){
        ProductList.remove(id);
    }

    public static HashMap<Integer, Product> getProductList(){
        return ProductList;
    }

    public static Product get(int id){
        return ProductList.get(id);
    }

    public int getId() {
        return id;
    }
}
