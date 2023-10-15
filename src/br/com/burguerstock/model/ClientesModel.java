/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.burguerstock.model;

/**
 *
 * @author dudu
 */
public class ClientesModel {
    private int id_client;
    private int idade;
    private String email;
    private String telefone;

    public ClientesModel() {
    }

    public ClientesModel(int id_client, int idade, String email, String telefone) {
        this.id_client = id_client;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
