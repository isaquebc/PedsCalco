/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans.mvc;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "carrinho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrinho.findAll", query = "SELECT c FROM Carrinho c")
    , @NamedQuery(name = "Carrinho.findByIdCarrinho", query = "SELECT c FROM Carrinho c WHERE c.idCarrinho = :idCarrinho")})
public class CarrinhoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carrinho")
    private Integer idCarrinho;
    @JoinTable(name = "categoria_produto", joinColumns = {
        @JoinColumn(name = "id_cat", referencedColumnName = "id_carrinho")}, inverseJoinColumns = {
        @JoinColumn(name = "id_prod", referencedColumnName = "id_produto")})
    @ManyToMany
    private Collection<ProdutoBean> produtoCollection;
    @JoinColumn(name = "cpf_cliente", referencedColumnName = "cpf_cliente")
    @ManyToOne
    private ClienteBean cpfCliente;
    @JoinColumn(name = "id_prod", referencedColumnName = "id_produto")
    @ManyToOne
    private ProdutoBean idProd;

    public CarrinhoBean() {
    }

    public CarrinhoBean(Integer idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Integer getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Integer idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    @XmlTransient
    public Collection<ProdutoBean> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<ProdutoBean> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    public ClienteBean getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(ClienteBean cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public ProdutoBean getIdProd() {
        return idProd;
    }

    public void setIdProd(ProdutoBean idProd) {
        this.idProd = idProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrinho != null ? idCarrinho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrinhoBean)) {
            return false;
        }
        CarrinhoBean other = (CarrinhoBean) object;
        if ((this.idCarrinho == null && other.idCarrinho != null) || (this.idCarrinho != null && !this.idCarrinho.equals(other.idCarrinho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Carrinho[ idCarrinho=" + idCarrinho + " ]";
    }
    
}
