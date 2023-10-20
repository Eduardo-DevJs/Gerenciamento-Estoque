package br.com.burguerstock.controller;

import br.com.burguerstock.dao.CategoriaDAO;
import br.com.burguerstock.dao.ClienteDAO;
import br.com.burguerstock.model.CategoriaModel;
import br.com.burguerstock.model.FornecedorModel;

public class CategoriaController {

    public boolean CadastroCategoria(String categoria) {
        if (categoria != null && categoria.length() > 0) {
            CategoriaModel categoriaModel = new CategoriaModel(categoria);
            CategoriaDAO cdao = new CategoriaDAO();
            
            cdao.createCatogory(categoriaModel);
            return true;
        }
        return false;
    }
}
