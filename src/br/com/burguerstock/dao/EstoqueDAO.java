
package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.EstoqueModel;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstoqueDAO {

    public void CreateProduct(EstoqueModel estoqueModel) {
        String sql = "INSERT INTO estoques (nome,preco_unitario,qtd_estoque, descricao) VALUES (?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, estoqueModel.getName());
            ps.setInt(2, estoqueModel.getPrice());
            ps.setInt(3, estoqueModel.getStockQuantity());
            ps.setString(4, estoqueModel.getDescription());
      

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produtos " + e);
        }
    }

    public List<EstoqueModel> getAllProducts() {

        String sql = "SELECT estoques.id_estoque, estoques.nome, estoques.preco_unitario, estoques.descricao, estoques.qtd_estoque, categorias.categoria FROM estoques INNER JOIN categorias ON estoques.id_estoque = categorias.id_estoque;";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        ArrayList<EstoqueModel> allProducts = new ArrayList<EstoqueModel>();

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                EstoqueModel produtoModel = new EstoqueModel();

                produtoModel.setId_stock(rs.getInt("id_estoque"));
                produtoModel.setName(rs.getString("nome"));
                produtoModel.setPrice(rs.getInt("preco_unitario"));
                produtoModel.setStockQuantity(rs.getInt("qtd_estoque"));
                produtoModel.setDescription(rs.getString("descricao"));
                

                allProducts.add(produtoModel);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar estoque " + e);
        }

        return allProducts;
    }

    public void updateProduct(EstoqueModel estoqueModel) {
        String sql = "UPDATE estoques SET descricao =?, preco_unitario=? WHERE id_estoque =?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

    
            ps.setString(1, estoqueModel.getDescription());
            ps.setInt(2, estoqueModel.getPrice());;

            ps.setInt(3, estoqueModel.getId_stock());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar estoque " + e);
        }
    }

    public void deleteProduct(int id) {
        String sql = "DELETE FROM estoques WHERE id_estoque=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar estoque " + e);

        }
    }
}
