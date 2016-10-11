/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans.mvc;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e")
    , @NamedQuery(name = "Endereco.findByIdEndereco", query = "SELECT e FROM Endereco e WHERE e.idEndereco = :idEndereco")
    , @NamedQuery(name = "Endereco.findByCepCliente", query = "SELECT e FROM Endereco e WHERE e.cepCliente = :cepCliente")
    , @NamedQuery(name = "Endereco.findByLogradoroCliente", query = "SELECT e FROM Endereco e WHERE e.logradoroCliente = :logradoroCliente")
    , @NamedQuery(name = "Endereco.findByTipoLogradouroCliente", query = "SELECT e FROM Endereco e WHERE e.tipoLogradouroCliente = :tipoLogradouroCliente")
    , @NamedQuery(name = "Endereco.findByNumero", query = "SELECT e FROM Endereco e WHERE e.numero = :numero")
    , @NamedQuery(name = "Endereco.findByComplementocliente", query = "SELECT e FROM Endereco e WHERE e.complementocliente = :complementocliente")})
public class EnderecoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_endereco")
    private Integer idEndereco;
    @Size(max = 12)
    @Column(name = "cep_cliente")
    private String cepCliente;
    @Size(max = 50)
    @Column(name = "logradoro_cliente")
    private String logradoroCliente;
    @Size(max = 4)
    @Column(name = "tipo_logradouro_cliente")
    private String tipoLogradouroCliente;
    @Column(name = "numero")
    private BigInteger numero;
    @Size(max = 10)
    @Column(name = "Complemento_cliente")
    private String complementocliente;
    @OneToMany(mappedBy = "enderecoEntrega")
    private Collection<VendaBean> vendaCollection;
    @JoinColumn(name = "id_cliente", referencedColumnName = "cpf_cliente")
    @ManyToOne(optional = false)
    private ClienteBean idCliente;

    public EnderecoBean() {
    }

    public EnderecoBean(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getLogradoroCliente() {
        return logradoroCliente;
    }

    public void setLogradoroCliente(String logradoroCliente) {
        this.logradoroCliente = logradoroCliente;
    }

    public String getTipoLogradouroCliente() {
        return tipoLogradouroCliente;
    }

    public void setTipoLogradouroCliente(String tipoLogradouroCliente) {
        this.tipoLogradouroCliente = tipoLogradouroCliente;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public String getComplementocliente() {
        return complementocliente;
    }

    public void setComplementocliente(String complementocliente) {
        this.complementocliente = complementocliente;
    }

    @XmlTransient
    public Collection<VendaBean> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<VendaBean> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    public ClienteBean getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteBean idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEndereco != null ? idEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnderecoBean)) {
            return false;
        }
        EnderecoBean other = (EnderecoBean) object;
        if ((this.idEndereco == null && other.idEndereco != null) || (this.idEndereco != null && !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Endereco[ idEndereco=" + idEndereco + " ]";
    }
    
}
