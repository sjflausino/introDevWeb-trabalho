/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author vertigo
 */
public class Compra {

    private int id;
    private int quantidadeCompra;
    private String dataCompra;
    private double valorCompra;
    private int idFornecedor;
    private int idProduto;
    private int idComprador;

    public Compra(int id, int quantidadeCompra, String dataCompra, double valorCompra, int idFornecedor, int idProduto, int idComprador) {
        this.id = id;
        this.quantidadeCompra = quantidadeCompra;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.idFornecedor = idFornecedor;
        this.idProduto = idProduto;
        this.idComprador = idComprador;
    }

    public Compra() {
        this.id = 0;
        this.quantidadeCompra = 0;
        this.dataCompra = "";
        this.valorCompra = 0;
        this.idFornecedor = 0;
        this.idProduto = 0;
        this.idComprador = 0;
    }

    public int getId() {
        return id;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

}
