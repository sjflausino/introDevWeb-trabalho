/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vertigo
 */
public class CompraDAO implements Dao<Compra> {

    @Override
    public Compra get(int id) {
        Conexao conexao = new Conexao();
        try {
            Compra compra = new Compra();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM Compras WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    // compra.setId(Integer.parseInt(resultado.getString("ID")));
                    // compra.setNome(resultado.getString("NOME"));
                    // compra.setCpf(resultado.getString("CPF"));
                    // compra.setEndereco(resultado.getString("ENDERECO"));
                    // compra.setBairro(resultado.getString("BAIRRO"));
                    // compra.setCidade(resultado.getString("CIDADE"));
                    // compra.setUf(resultado.getString("UF"));
                    // compra.setCep(resultado.getString("CEP"));
                    // compra.setTelefone(resultado.getString("TELEFONE"));
                    // compra.setEmail(resultado.getString("EMAIL"));
                }
            }
            return compra;

        } catch (SQLException e) {
            throw new RuntimeException("Query de select (get compra) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void insert(Compra compra) {

        Conexao conexao = new Conexao();
        try {
            // PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Compras (nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) VALUES (?,?,?,?,?,?,?,?)");
            // sql.setString(1, compra.getNome());
            // sql.setString(2, compra.getCpf());
            // sql.setString(3, compra.getEndereco());
            // sql.setString(4, compra.getBairro());
            // sql.setString(5, compra.getCidade());
            // sql.setString(6, compra.getUf());
            // sql.setString(7, compra.getCep());
            // sql.setString(8, compra.getTelefone());
            // sql.setString(9, compra.getEmail());

        } catch (SQLException e) {
            throw new RuntimeException("Query de insert (comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Compra> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Compra compra) {
        Conexao conexao = new Conexao();
        try {
            // PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Compras SET nome = ?, cpf = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, telefone = ?, email = ?  WHERE ID = ? ");
            // sql.setString(1, compra.getNome());
            // sql.setString(2, compra.getCpf());
            // sql.setString(3, compra.getEndereco());
            // sql.setString(4, compra.getBairro());
            // sql.setString(5, compra.getCidade());
            // sql.setString(6, compra.getUf());
            // sql.setString(7, compra.getCep());
            // sql.setString(8, compra.getTelefone());
            // sql.setString(9, compra.getEmail());
            // sql.setInt(10, compra.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de update (alterar comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    public void delete(Compra compra) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM Compras WHERE ID = ? ");
            sql.setInt(1, compra.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de delete (excluir) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void delete(int id) {
        // TODO
    }
}
