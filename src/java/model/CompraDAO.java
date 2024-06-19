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
                    compra.setId(Integer.parseInt(resultado.getString("ID")));
                    compra.setQuantidadeCompra(resultado.getString("QUANTIDADE_COMPRA"));
                    compra.setDataCompra(resultado.getString("DATA_COMPRA"));
                    compra.setValorCompra(resultado.getString("VALOR_COMPRA"));
                    compra.setIdFornecedor(resultado.getString("ID_FORNECEDOR"));
                    compra.setIdProduto(resultado.getString("ID_PRODUTO"));
                    compra.setIdComprador(resultado.getString("ID_COMPRADOR"));
                    
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
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Compras (quantidadeCompra, dataCompra, valorCompra, idFornecedor, idProduto, idComprador ) VALUES (?,?,?,?,?,?)");
            sql.setString(1, compra.getQuantidadeCompra());
            sql.setString(2, compra.getDataCompra());
            sql.setString(3, compra.getValorCompra());
            sql.setString(4, compra.getIdFornecedor());
            sql.setString(5, compra.getIdProduto());
            sql.setString(6, compra.getIdComprador());

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
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Compras SET quantidadeCompra = ?, dataCompra = ?, valorCompra = ?, idFornecedor = ?, idProduto = ?, idComprador = ?  WHERE ID = ? ");
            sql.setString(1, compra.getQuantidadeCompra());
            sql.setString(2, compra.getDataCompra());
            sql.setString(3, compra.getValorCompra());
            sql.setString(4, compra.getIdFornecedor());
            sql.setString(5, compra.getIdProduto());
            sql.setString(6, compra.getIdComprador());
            sql.setInt(7, compra.getId());
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
