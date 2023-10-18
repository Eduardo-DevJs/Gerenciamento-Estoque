package br.com.burguerstock.controller;

import br.com.burguerstock.dao.EstoqueDAO;
import br.com.burguerstock.model.EstoqueModel;

public class EstoqueController {

    public boolean CadastroEstoque(String nome, Integer preco, String descricao, Integer QuantidadeEstoque, String categoria) {
        if (nome != null && nome.length() > 0 && preco > 0 && descricao != null && descricao.length() > 0 && QuantidadeEstoque > 0  && categoria != null) {
            EstoqueModel pm = new EstoqueModel(nome, descricao, preco, QuantidadeEstoque, categoria);
            EstoqueDAO pdao = new EstoqueDAO();
            pdao.CreateProduct(pm);
            return true;
        }

        return false;
    }

    
    public boolean EditarEstoque(Integer id_estoque,Integer preco, String descricao) {
        if (preco > 0 && descricao != null && descricao.length() > 0) {
            EstoqueModel em = new EstoqueModel(id_estoque,descricao,preco);
            EstoqueDAO edao = new EstoqueDAO();
            edao.updateProduct(em);
            return true;
        }

        return false;
    }


}
