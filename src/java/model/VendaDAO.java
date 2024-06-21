package model;

import entidade.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                    venda.setQuantidadeVenda(Integer.parseInt(resultado.getString("QUANTIDADE_VENDA")));
                    venda.setDataVenda(resultado.getString("DATA_VENDA"));
                    venda.setValorVenda(Integer.parseInt(resultado.getString("VALOR_VENDA")));
                    venda.setIdCliente(resultado.getInt("ID_CLIENTE"));
                    venda.setIdProduto(Integer.parseInt(resultado.getString("ID_PRODUTO")));
                    venda.setIdVendedor(Integer.parseInt(resultado.getString("ID_VENDEDOR")));
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
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO Vendas (quantidade_venda, data_venda, valor_venda, id_cliente, id_produto, id_vendedor ) VALUES (?,?,?,?,?,?)");
            sql.setInt(1, venda.getQuantidadeVenda());
            // sql.setString(2, venda.getDataVenda());
            sql.setDouble(3, venda.getValorVenda());
            sql.setInt(4, venda.getIdCliente());
            sql.setInt(5, venda.getIdProduto());
            sql.setInt(6, venda.getIdVendedor());

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
            sql.setInt(1, venda.getQuantidadeVenda());
            // sql.setString(2, venda.getDataVenda());
            sql.setDouble(3, venda.getValorVenda());
            sql.setInt(4, venda.getIdCliente());
            sql.setInt(5, venda.getIdProduto());
            sql.setInt(6, venda.getIdVendedor());
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
