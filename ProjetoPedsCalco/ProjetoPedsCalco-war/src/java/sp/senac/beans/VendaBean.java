/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isaque.bcosta1
 */
@ManagedBean
@RequestScoped
public class VendaBean {

    private int id;
    private double valorToal;
    private Date dtVenda;
    private String formaDePagamento;
    private EnderecoBean enderecoDeEntrega;
    private int idCliente;

    public int getId() {
        return id;
    }

    public double getValorToal() {
        return valorToal;
    }

    public void setValorToal(double valorToal) {
        this.valorToal = valorToal;
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public EnderecoBean getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(EnderecoBean enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    /**
     * Creates a new instance of VendaBean
     */
    public VendaBean() {
    }

}
