
package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.ProdutoModel;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void CreateProduct(ProdutoModel produtoModel) {
        String sql = "INSERT INTO produtos (nome,descricao,preco,estoque) VALUES (?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, produtoModel.getName());
            ps.setString(2, produtoModel.getDescription());
            ps.setInt(3, produtoModel.getPrice());
            ps.setInt(4, produtoModel.getStockQuantity());
    

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produtos " + e);
        }
    }

    public List<ProdutoModel> getAllProducts() {

        String sql = "SELECT * FROM produtos";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        ArrayList<ProdutoModel> allProducts = new ArrayList<ProdutoModel>();

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProdutoModel produtoModel = new ProdutoModel();

                produtoModel.setId_product(rs.getInt("id_produto"));
                produtoModel.setName(rs.getString("nome"));
                produtoModel.setDescription(rs.getString("descricao"));
                produtoModel.setPrice(rs.getInt("preco"));
                produtoModel.setStockQuantity(rs.getInt("estoque"));

                allProducts.add(produtoModel);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar produtos" + e);
        }

        return allProducts;
    }

    public void updateProduct(ProdutoModel produtoModel) {
        String sql = "UPDATE produtos SET descricao =?, preco=? WHERE id_produto =?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

    
            ps.setString(1, produtoModel.getDescription());
            ps.setInt(2, produtoModel.getPrice());;

            ps.setInt(3, produtoModel.getId_product());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar produtos " + e);
        }
    }

    public void deleteProduct(int id) {
        String sql = "DELETE FROM produtos WHERE id_produto=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar produtos " + e);

        }
    }
}
