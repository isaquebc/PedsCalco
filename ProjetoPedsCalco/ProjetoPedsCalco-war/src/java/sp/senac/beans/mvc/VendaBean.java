/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans.mvc;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v")
    , @NamedQuery(name = "Venda.findByIdVenda", query = "SELECT v FROM Venda v WHERE v.idVenda = :idVenda")
    , @NamedQuery(name = "Venda.findByValortotalVenda", query = "SELECT v FROM Venda v WHERE v.valortotalVenda = :valortotalVenda")
    , @NamedQuery(name = "Venda.findByDataVenda", query = "SELECT v FROM Venda v WHERE v.dataVenda = :dataVenda")
    , @NamedQuery(name = "Venda.findByFormaPagamento", query = "SELECT v FROM Venda v WHERE v.formaPagamento = :formaPagamento")})
public class VendaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venda")
    private Integer idVenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valortotal_venda")
    private float valortotalVenda;
    @Column(name = "data_venda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Size(max = 20)
    @Column(name = "forma_pagamento")
    private String formaPagamento;
    @JoinColumn(name = "cpf_cliente", referencedColumnName = "cpf_cliente")
    @ManyToOne(optional = false)
    private ClienteBean cpfCliente;
    @JoinColumn(name = "endereco_entrega", referencedColumnName = "id_endereco")
    @ManyToOne
    private EnderecoBean enderecoEntrega;

    public VendaBean() {
    }

    public VendaBean(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public VendaBean(Integer idVenda, float valortotalVenda) {
        this.idVenda = idVenda;
        this.valortotalVenda = valortotalVenda;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public float getValortotalVenda() {
        return valortotalVenda;
    }

    public void setValortotalVenda(float valortotalVenda) {
        this.valortotalVenda = valortotalVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ClienteBean getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(ClienteBean cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public EnderecoBean getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoBean enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenda != null ? idVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaBean)) {
            return false;
        }
        VendaBean other = (VendaBean) object;
        if ((this.idVenda == null && other.idVenda != null) || (this.idVenda != null && !this.idVenda.equals(other.idVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Venda[ idVenda=" + idVenda + " ]";
    }
    
}
