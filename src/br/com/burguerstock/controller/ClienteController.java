/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.burguerstock.controller;

import br.com.burguerstock.dao.ClienteDAO;
import br.com.burguerstock.model.FornecedorModel;

public class ClienteController {
    public boolean CadastroCliente(String nome, int idade,String email, String telefone) {
        if (nome != null && nome.length() > 0 && idade > 0 && telefone != null && email != null && email.length() > 0) {
            FornecedorModel cm = new FornecedorModel(nome,idade,email,telefone);
            ClienteDAO cdao = new ClienteDAO();
            cdao.createClient(cm);
            return true;
        }
        return false;
    }

}
