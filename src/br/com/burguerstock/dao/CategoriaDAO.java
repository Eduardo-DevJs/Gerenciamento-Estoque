package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.CategoriaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    public void createCatogory(CategoriaModel categoriaModel) {
        String sql = "INSERT INTO categorias (categoria) VALUES (?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, categoriaModel.getCategory());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar categoria " + e);
        }
    }

    public List<CategoriaModel> getCategory() {
        String sql = "SELECT * FROM categorias";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<CategoriaModel> categories = new ArrayList<CategoriaModel>();
        
        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
           
            
            while(rs.next()){
                CategoriaModel categoriaModel = new CategoriaModel();
               
                categoriaModel.setCategory(rs.getString("categoria"));
        
                categories.add(categoriaModel);
            }
         
            
        } catch (Exception e) {
            System.out.println("Erro ao mostrar categorias " + e);
        }
        
        return categories;
    }
}
