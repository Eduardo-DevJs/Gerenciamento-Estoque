package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.AdministradoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class AdministradorDAO {

    public ResultSet authenticateAdministrator(AdministradoModel administradoModel) {
        String sql = "SELECT * FROM administradores WHERE nome_adm = ? and senha_adm = ?";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, administradoModel.getName());
            ps.setString(2, administradoModel.getPassword());

            rs = ps.executeQuery();

            return rs;

        } catch (Exception e) {
            System.out.println("Erro autenticacao do administrador " + e);
            return null;
        }

    }
}
