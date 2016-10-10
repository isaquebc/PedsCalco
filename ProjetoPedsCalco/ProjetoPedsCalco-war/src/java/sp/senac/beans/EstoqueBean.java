/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isaque.bcosta1
 */
@ManagedBean
@RequestScoped
public class EstoqueBean {

    private ProdutoBean produto;
    private int quantidade;
    private String status;

    public ProdutoBean getProduto() {
        return produto;
    }

    public void setProduto(ProdutoBean produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Creates a new instance of EstoqueBean
     */
    public EstoqueBean() {
    }

}
