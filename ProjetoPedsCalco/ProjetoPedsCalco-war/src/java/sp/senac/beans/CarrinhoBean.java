/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isaque.bcosta1
 */
@ManagedBean
@RequestScoped
public class CarrinhoBean {

    private int id;
    private ClienteBean cliente;
    private List<ProdutoBean> produtos;
    private double valorTotal;

    /**
     * Creates a new instance of CarrinhoBean
     */
    public CarrinhoBean() {
    }

    public List<ProdutoBean> getProdutos() {
        return produtos;
    }
    
    public void setProduto(ProdutoBean produto){
        produtos.add(produto);
    }
    public void removeProduto(ProdutoBean produto){
        produtos.remove(produto);
    }
    public int getId() {
        return id;
    }

    public ClienteBean getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
