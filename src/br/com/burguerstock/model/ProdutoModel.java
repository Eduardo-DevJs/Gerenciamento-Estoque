
package br.com.burguerstock.model;

public class ProdutoModel {
    private int id_product;
    private String name; 
    private String description;
    private int price;
    private int stockQuantity;
    
    public ProdutoModel(){
        
    }

    public ProdutoModel(int id_product, String name, String description, int price, int stockQuantity) {
        this.id_product = id_product;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
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

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
    
    
    
}
