package br.com.burguerstock.model;

public class CategoriaModel {

    private int id_category;
    private String category;
    private int id_estoque;

    public CategoriaModel() {
    }

    public CategoriaModel(int id_category, String category, int id_estoque) {
        this.id_category = id_category;
        this.category = category;
        this.id_estoque = id_estoque;
    }

    public CategoriaModel(String category) {
        this.category = category;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    @Override
    public String toString() {
        return getCategory();
    }

    
}
