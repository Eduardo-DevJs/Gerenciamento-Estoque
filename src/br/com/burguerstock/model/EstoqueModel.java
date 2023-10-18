package br.com.burguerstock.model;

public class EstoqueModel {

    private int id_stock;
    private String name;
    private String description;
    private int price;
    private int stockQuantity;
    private String category;

    public EstoqueModel() {

    }

    public EstoqueModel(int id_stock, String name, String description, int price, int stockQuantity) {
        this.id_stock = id_stock;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public EstoqueModel(String name, String description, int price, int stockQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public EstoqueModel(String name, String description, int price, int stockQuantity, String categoria) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = categoria;
    }

    public EstoqueModel(String description, int price) {
        this.description = description;
        this.price = price;
    }
    
    
    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String categoria) {
        this.category = categoria;
    }

    @Override
    public String toString() {
        return getCategory();
    }

    
}
