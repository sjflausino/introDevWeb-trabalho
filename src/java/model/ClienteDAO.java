/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vertigo
 */
public class ClienteDAO implements Dao<Cliente> {

    @Override
    public Cliente get(int id) {
        Conexao conexao = new Conexao();
        try {
            Cliente cliente = new Cliente();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM clientes WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    cliente.setId(Integer.parseInt(resultado.getString("ID")));
                    cliente.setNome(resultado.getString("NOME"));
                    cliente.setCpf(resultado.getString("CPF"));
                    cliente.setEndereco(resultado.getString("ENDERECO"));
                    cliente.setBairro(resultado.getString("BAIRRO"));
                    cliente.setCidade(resultado.getString("CIDADE"));
                    cliente.setUf(resultado.getString("UF"));
                    cliente.setCep(resultado.getString("CEP"));
                    cliente.setTelefone(resultado.getString("TELEFONE"));
                    cliente.setEmail(resultado.getString("EMAIL"));
                }
            }
            return cliente;

        } catch (SQLException e) {
            throw new RuntimeException("Query de select (get cliente) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void insert(Cliente cliente) {

        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO clientes (nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) VALUES (?,?,?,?,?,?,?,?)");
            sql.setString(1, cliente.getNome());
            sql.setString(2, cliente.getCpf());
            sql.setString(3, cliente.getEndereco());
            sql.setString(4, cliente.getBairro());
            sql.setString(5, cliente.getCidade());
            sql.setString(6, cliente.getUf());
            sql.setString(7, cliente.getCep());
            sql.setString(8, cliente.getTelefone());
            sql.setString(9, cliente.getEmail());

        } catch (SQLException e) {
            throw new RuntimeException("Query de insert (comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Cliente> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Cliente cliente) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Clientes SET nome = ?, cpf = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, telefone = ?, email = ?  WHERE ID = ? ");
            sql.setString(1, cliente.getNome());
            sql.setString(2, cliente.getCpf());
            sql.setString(3, cliente.getEndereco());
            sql.setString(4, cliente.getBairro());
            sql.setString(5, cliente.getCidade());
            sql.setString(6, cliente.getUf());
            sql.setString(7, cliente.getCep());
            sql.setString(8, cliente.getTelefone());
            sql.setString(9, cliente.getEmail());
            sql.setInt(10, cliente.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de update (alterar comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    public void delete(Cliente cliente) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM clientes WHERE ID = ? ");
            sql.setInt(1, cliente.getId());
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
