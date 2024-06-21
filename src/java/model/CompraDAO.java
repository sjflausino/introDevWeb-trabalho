package model;

import entidade.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompraDAO implements Dao<Compra> {

    @Override
    public Compra get(int id) {
        Conexao conexao = new Conexao();
        try {
            Compra compra = new Compra();
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM compras WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    compra.setId(Integer.parseInt(resultado.getString("ID")));
                    compra.setQuantidadeCompra(resultado.getInt("QUANTIDADE_COMPRA"));
                    // compra.setDataCompra(resultado.getString("DATA_COMPRA"));
                    compra.setValorCompra(resultado.getDouble("VALOR_COMPRA"));
                    compra.setIdFornecedor(resultado.getInt("ID_FORNECEDOR"));
                    compra.setIdProduto(resultado.getInt("ID_PRODUTO"));
                    compra.setIdComprador(resultado.getInt("ID_COMPRADOR"));

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
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO compras (quantidade_compra, data_compra, valor_compra, id_fornecedor, id_produto, id_comprador ) VALUES (?,?,?,?,?,?)");
            sql.setDouble(1, compra.getQuantidadeCompra());
            // sql.setString(2, compra.getDataCompra());
            sql.setDouble(3, compra.getValorCompra());
            sql.setInt(4, compra.getIdFornecedor());
            sql.setInt(5, compra.getIdProduto());
            sql.setInt(6, compra.getIdComprador());

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
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE compras SET quantidade_compra = ?, data_compra = ?, valor_compra = ?, id_fornecedor = ?, id_produto = ?, id_comprador = ?  WHERE ID = ? ");
            sql.setDouble(1, compra.getQuantidadeCompra());
            // sql.setString(2, compra.getDataCompra());
            sql.setDouble(3, compra.getValorCompra());
            sql.setInt(4, compra.getIdFornecedor());
            sql.setInt(5, compra.getIdProduto());
            sql.setInt(6, compra.getIdComprador());
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
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM compras WHERE ID = ? ");
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
