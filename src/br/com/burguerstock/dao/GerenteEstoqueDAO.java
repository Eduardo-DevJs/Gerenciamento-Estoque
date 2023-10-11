package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.AdministradoModel;
import br.com.burguerstock.model.GerenteModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class GerenteEstoqueDAO {

    public ResultSet authenticateManager(GerenteModel gerenteModel) {
        String sql = "SELECT * FROM gerente WHERE nome_gerente = ? and senha_gerente = ?";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, gerenteModel.getName());
            ps.setString(2, gerenteModel.getPassword());

            rs = ps.executeQuery();

            return rs;

        } catch (Exception e) {
            System.out.println("Erro autenticacao do administrador " + e);
            return null;
        }

    }
}
