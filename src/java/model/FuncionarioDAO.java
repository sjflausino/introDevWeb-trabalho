/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vertigo
 */
public class FuncionarioDAO implements Dao<Funcionario> {

    @Override
    public Funcionario get(int id) {
        Conexao conexao = new Conexao();
        try {
            Funcionario funcionario = new Funcionario();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM Funcionarios WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    // funcionario.setId(Integer.parseInt(resultado.getString("ID")));
                    // funcionario.setNome(resultado.getString("NOME"));
                    // funcionario.setCpf(resultado.getString("CPF"));
                    // funcionario.setEndereco(resultado.getString("ENDERECO"));
                    // funcionario.setBairro(resultado.getString("BAIRRO"));
                    // funcionario.setCidade(resultado.getString("CIDADE"));
                    // funcionario.setUf(resultado.getString("UF"));
                    // funcionario.setCep(resultado.getString("CEP"));
                    // funcionario.setTelefone(resultado.getString("TELEFONE"));
                    // funcionario.setEmail(resultado.getString("EMAIL"));
                }
            }
            return funcionario;

        } catch (SQLException e) {
            throw new RuntimeException("Query de select (get funcionario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void insert(Funcionario funcionario) {

        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Funcionarios (nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) VALUES (?,?,?,?,?,?,?,?)");
            // sql.setString(1, funcionario.getNome());
            // sql.setString(2, funcionario.getCpf());
            // sql.setString(3, funcionario.getEndereco());
            // sql.setString(4, funcionario.getBairro());
            // sql.setString(5, funcionario.getCidade());
            // sql.setString(6, funcionario.getUf());
            // sql.setString(7, funcionario.getCep());
            // sql.setString(8, funcionario.getTelefone());
            // sql.setString(9, funcionario.getEmail());

        } catch (SQLException e) {
            throw new RuntimeException("Query de insert (comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Funcionario> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Funcionario funcionario) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Funcionarios SET nome = ?, cpf = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, telefone = ?, email = ?  WHERE ID = ? ");
            // sql.setString(1, funcionario.getNome());
            // sql.setString(2, funcionario.getCpf());
            // sql.setString(3, funcionario.getEndereco());
            // sql.setString(4, funcionario.getBairro());
            // sql.setString(5, funcionario.getCidade());
            // sql.setString(6, funcionario.getUf());
            // sql.setString(7, funcionario.getCep());
            // sql.setString(8, funcionario.getTelefone());
            // sql.setString(9, funcionario.getEmail());
            // sql.setInt(10, funcionario.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de update (alterar comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    public void delete(Funcionario funcionario) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM Funcionarios WHERE ID = ? ");
            sql.setInt(1, funcionario.getId());
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
