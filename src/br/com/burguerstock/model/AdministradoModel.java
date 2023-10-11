package br.com.burguerstock.model;

public class AdministradoModel {
    private int id_administrador;
    private String name;
    private String password;
    
    public AdministradoModel(){
        
    }

    public AdministradoModel(int id_administrador, String name, String password) {
        this.id_administrador = id_administrador;
        this.name = name;
        this.password = password;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
