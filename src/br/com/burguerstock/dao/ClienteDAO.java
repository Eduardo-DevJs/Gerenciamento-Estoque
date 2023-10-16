package br.com.burguerstock.dao;

import br.com.burguerstock.conexao.Conexao;
import br.com.burguerstock.model.ProdutoModel;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import br.com.burguerstock.model.ClienteModel;

public class ClienteDAO {

    public void createClient(ClienteModel clientesModel) {
        String sql = "INSERT INTO clientes (nome, idade, email, telefone) VALUES (?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, clientesModel.getName());
            ps.setInt(2, clientesModel.getAge());
            ps.setString(3, clientesModel.getEmail());
            ps.setString(4, clientesModel.getTelephone());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar Cliente " + e);
        }
    }

    public List<ClienteModel> getClients() {

        String sql = "SELECT * FROM clientes";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<ClienteModel> allClients = new ArrayList<ClienteModel>();

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteModel cm = new ClienteModel();

                cm.setId_client(rs.getInt("id_cliente"));
                cm.setName(rs.getString("nome"));
                cm.setAge(rs.getInt("idade"));
                cm.setEmail(rs.getString("email"));
                cm.setTelephone(rs.getString("telefone"));

                allClients.add(cm);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar clientes " + e);
        }

        return allClients;
    }

    public void updateClient(ClienteModel clienteModel) {
        String sql = "UPDATE SET clientes nome=?, idade=?, email=?, telefone=? WHERE id_cliente";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, clienteModel.getName());
            ps.setInt(2, clienteModel.getAge());
            ps.setString(3, clienteModel.getEmail());
            ps.setString(4, clienteModel.getTelephone());

            ps.setInt(5, clienteModel.getId_client());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar clientes " + e);
        }
    }

    public void deleteClient(int id) {
        String sql = "DELETO FROM clientes WHERE id_cliente";

        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = Conexao.createConnectionSQL();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro ao deletar clientes " + e);
        }
    }
}
