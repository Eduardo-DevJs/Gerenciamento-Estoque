package br.com.burguerstock.model;

public class FornecedorModel {

    private int id_client;
    private String name;
    private int age;
    private String email;
    private String telephone;

    public FornecedorModel() {
    }

    public FornecedorModel(int id_client, String name, int age, String email, String telephone) {
        this.id_client = id_client;
        this.name = name;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public FornecedorModel(String name, int age, String email, String telephone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
