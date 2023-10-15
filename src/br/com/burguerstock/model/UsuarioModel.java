
package br.com.burguerstock.model;

public class UsuarioModel {
    private int id_user;
    private String name;
    private String senha;
    private String perfil;

    public UsuarioModel() {
        
    }

    public UsuarioModel(int id_user, String name, String senha, String perfil) {
        this.id_user = id_user;
        this.name = name;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
}
