/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vertigo
 */
public class VendaDAO implements Dao<Venda> {

    @Override
    public Venda get(int id) {
        Conexao conexao = new Conexao();
        try {
            Venda venda = new Venda();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM Vendas WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    venda.setId(Integer.parseInt(resultado.getString("ID")));
                    venda.setQuantidadeVenda(resultado.getString("QUANTIDADE_VENDA"));
                    venda.setDataVenda(resultado.getString("DATA_VENDA"));
                    venda.setValorVenda(resultado.getString("VALOR_VENDA"));
                    venda.setIdCliente(resultado.getString("ID_CLIENTE"));
                    venda.setIdProduto(resultado.getString("ID_PRODUTO"));
                    venda.setIdVendedor(resultado.getString("ID_VENDEDOR"));

                }
            }
            return venda;

        } catch (SQLException e) {
            throw new RuntimeException("Query de select (get venda) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void insert(Venda venda) {

        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Vendas (quantidadeVenda, dataVenda, valorVenda, idCliente, idProduto, idVendedor ) VALUES (?,?,?,?,?,?)");
            sql.setString(1, venda.getQuantidadeVenda()); 
            sql.setString(2, venda.getDataVenda());
            sql.setString(3, venda.getValorVenda());
            sql.setString(4, venda.getIdCliente());
            sql.setString(5, venda.getIdProduto());
            sql.setString(6, venda.getIdVendedor());

        } catch (SQLException e) {
            throw new RuntimeException("Query de insert (comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Venda> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Venda venda) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE Vendas SET quantidadeVenda = ?, dataVenda = ?, valorVenda = ?, idCliente = ?, idProduto = ?, idVendedor = ?  WHERE ID = ? ");
            sql.setString(1, venda.getQuantidadeVenda()); 
            sql.setString(2, venda.getDataVenda());
            sql.setString(3, venda.getValorVenda());
            sql.setString(4, venda.getIdCliente());
            sql.setString(5, venda.getIdProduto());
            sql.setString(6, venda.getIdVendedor());
            sql.setInt(7, venda.getId());
            sql.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Query de update (alterar comentario) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    public void delete(Venda venda) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM Vendas WHERE ID = ? ");
            sql.setInt(1, venda.getId());
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
