
package br.com.burguerstock.model;

public class GerenteModel {
    private int id_gerente;
    private String name;
    private String password;

    public GerenteModel() {
    }

    public GerenteModel(int id_gerente, String name, String password) {
        this.id_gerente = id_gerente;
        this.name = name;
        this.password = password;
    }

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
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
