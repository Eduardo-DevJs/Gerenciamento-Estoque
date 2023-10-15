package br.com.burguerstock.controller;

import br.com.burguerstock.dao.ProdutoDAO;
import br.com.burguerstock.model.ProdutoModel;

public class ProdutoController {

    public boolean CadastroProduto(String nome, Integer preco, String descricao, Integer QuantidadeEstoque) {
        if (nome != null && nome.length() > 0 && preco > 0 && descricao != null && descricao.length() > 0 && QuantidadeEstoque > 0) {
            ProdutoModel pm = new ProdutoModel(nome, descricao, preco, preco);
            ProdutoDAO pdao = new ProdutoDAO();
            pdao.CreateProduct(pm);
            return true;
        }

        return false;
    }

    public boolean EditarProduto(Integer id_produto,Integer preco, String descricao) {
        if (preco > 0 && descricao != null && descricao.length() > 0) {
            ProdutoModel pm = new ProdutoModel(id_produto,descricao, preco);
            ProdutoDAO pdao = new ProdutoDAO();
            pdao.updateProduct(pm);
            return true;
        }

        return false;
    }

}
