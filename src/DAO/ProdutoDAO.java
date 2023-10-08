package DAO;

import MODELS.ProdutoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public void createProduct(ProdutoModel produtoModel) {
        String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade_estoque) VALUES (?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = CONEXAO.Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, produtoModel.getName());
            ps.setString(2, produtoModel.getDescription());
            ps.setInt(3, produtoModel.getPrice());
            ps.setInt(4, produtoModel.getStockQuantity());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro cadastro produto " + e);
        }
    }

    public List<ProdutoModel> showProducts() {

        String sql = "SELECT * FROM produtos";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<ProdutoModel> allProducts = new ArrayList<ProdutoModel>();

        try {
            con = CONEXAO.Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProdutoModel produtoModel = new ProdutoModel();

                produtoModel.setId_product(rs.getInt("id_produto"));
                produtoModel.setName(rs.getString("nome"));
                produtoModel.setDescription(rs.getString("descricao"));
                produtoModel.setPrice(rs.getInt("preco"));
                produtoModel.setStockQuantity(rs.getInt("quantidade_estoque"));

                allProducts.add(produtoModel);

            }

        } catch (Exception e) {
            System.out.println("Erro mostrar produtos " + e);
        }

        return allProducts;
    }

    public void updateProduct(ProdutoModel produtoModel) {
        String sql = "UPDATE SET produtos nome=?, descricao=?, preco=?, quantidade_estoque WHERE id_produto";

        Connection con = null;
        PreparedStatement ps = null;
 

        try {
            con = CONEXAO.Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, produtoModel.getName());
            ps.setString(2, produtoModel.getDescription());
            ps.setInt(3, produtoModel.getPrice());
            ps.setInt(4, produtoModel.getStockQuantity());

            ps.setInt(5, produtoModel.getId_product());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro atualizar produto " + e);
        }
    }

    public void deleteProduct(int id) {

        String sql = "DELETE FROM produtos WHERE id_produto";

        Connection con = null;
        PreparedStatement ps = null;
       
        
        try {
            con = CONEXAO.Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            
        } catch (Exception e) {
            System.out.println("Erro deletar pŕoduto " + e);
        }
    }
}
