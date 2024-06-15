/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vertigo
 */
public class FornecedorDAO implements Dao<Fornecedor> {

    @Override
    public Fornecedor get(int id) {
        Conexao conexao = new Conexao();
        try {
            Fornecedor fornecedor = new Fornecedor();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM Fornecedores WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    // fornecedor.setId(Integer.parseInt(resultado.getString("ID")));
                    // fornecedor.setNome(resultado.getString("NOME"));
                    // fornecedor.setCpf(resultado.getString("CPF"));
                    // fornecedor.setEndereco(resultado.getString("ENDERECO"));
                    // fornecedor.setBairro(resultado.getString("BAIRRO"));
                    // fornecedor.setCidade(resultado.getString("CIDADE"));
                    // fornecedor.setUf(resultado.getString("UF"));
                    // fornecedor.setCep(resultado.getString("CEP"));
                    // fornecedor.setTelefone(resultado.getString("TELEFONE"));
                    // fornecedor.setEmail(resultado.getString("EMAIL"));
                }
            }
            return fornecedor;

        } catch (SQLException e) {
            throw new RuntimeException("Query de select (get fornecedor) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void insert(Fornecedor fornecedor) {

        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Fornecedores (nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) VALUES (?,?,?,?,?,?,?,?)");
            // sql.setString(1, fornecedor.getNome());
            // sql.setString(2, fornecedor.getCpf());
            // sql.setString(3, fornecedor.getEndereco());
            // sql.setString(4, fornecedor.getBairro());
            // sql.setString(5, fornecedor.getCidade());
            // sql.setString(6, fornecedor.getUf());
            // sql.setString(7, fornecedor.getCep());
            // sql.setString(8, fornecedor.getTelefone());
            // sql.setString(9, fornecedor.getEmail());

        } catch (SQLException e) {
            throw new RuntimeException("Query de insert (comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Fornecedor> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Fornecedor fornecedor) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Fornecedores SET nome = ?, cpf = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, telefone = ?, email = ?  WHERE ID = ? ");
            // sql.setString(1, fornecedor.getNome());
            // sql.setString(2, fornecedor.getCpf());
            // sql.setString(3, fornecedor.getEndereco());
            // sql.setString(4, fornecedor.getBairro());
            // sql.setString(5, fornecedor.getCidade());
            // sql.setString(6, fornecedor.getUf());
            // sql.setString(7, fornecedor.getCep());
            // sql.setString(8, fornecedor.getTelefone());
            // sql.setString(9, fornecedor.getEmail());
            // sql.setInt(10, fornecedor.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de update (alterar comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    public void delete(Fornecedor fornecedor) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM Fornecedores WHERE ID = ? ");
            sql.setInt(1, fornecedor.getId());
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
