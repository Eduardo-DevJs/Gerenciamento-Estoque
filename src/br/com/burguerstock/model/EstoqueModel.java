package br.com.burguerstock.model;

public class EstoqueModel {

    private int id_stock;
    private String name;
    private int price;
    private int stockQuantity;
    private String description;

    public EstoqueModel() {

    }

    public EstoqueModel(int id_stock, String name, int price, int stockQuantity, String description) {
        this.id_stock = id_stock;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    public EstoqueModel(String name, int price, int stockQuantity, String description) {
        this.id_stock = id_stock;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    public EstoqueModel(int id_stock, String description, int price) {
        this.id_stock = id_stock;
        this.price = price;
        this.description = description;
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

}
