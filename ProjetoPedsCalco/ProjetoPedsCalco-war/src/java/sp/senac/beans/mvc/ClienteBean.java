/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans.mvc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "Cliente.findBySobrenome", query = "SELECT c FROM Cliente c WHERE c.sobrenome = :sobrenome")
    , @NamedQuery(name = "Cliente.findByLoginCliente", query = "SELECT c FROM Cliente c WHERE c.loginCliente = :loginCliente")
    , @NamedQuery(name = "Cliente.findBySenhaCliente", query = "SELECT c FROM Cliente c WHERE c.senhaCliente = :senhaCliente")
    , @NamedQuery(name = "Cliente.findByNascimentoCliente", query = "SELECT c FROM Cliente c WHERE c.nascimentoCliente = :nascimentoCliente")
    , @NamedQuery(name = "Cliente.findByCelCliente", query = "SELECT c FROM Cliente c WHERE c.celCliente = :celCliente")
    , @NamedQuery(name = "Cliente.findByEmailCliente", query = "SELECT c FROM Cliente c WHERE c.emailCliente = :emailCliente")
    , @NamedQuery(name = "Cliente.findByCpfCliente", query = "SELECT c FROM Cliente c WHERE c.cpfCliente = :cpfCliente")})
public class ClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "login_cliente")
    private String loginCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "senha_cliente")
    private String senhaCliente;
    @Column(name = "nascimento_cliente")
    @Temporal(TemporalType.DATE)
    private Date nascimentoCliente;
    @Column(name = "cel_cliente")
    private Integer celCliente;
    @Size(max = 30)
    @Column(name = "email_cliente")
    private String emailCliente;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpfCliente")
    private Collection<VendaBean> vendaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<EnderecoBean> enderecoCollection;
    @OneToMany(mappedBy = "cpfCliente")
    private Collection<CarrinhoBean> carrinhoCollection;

    public ClienteBean() {
    }

    public ClienteBean(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public ClienteBean(String cpfCliente, int idCliente, String nomeCliente, String sobrenome, String loginCliente, String senhaCliente) {
        this.cpfCliente = cpfCliente;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.sobrenome = sobrenome;
        this.loginCliente = loginCliente;
         this.senhaCliente = senhaCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public Date getNascimentoCliente() {
        return nascimentoCliente;
    }

    public void setNascimentoCliente(Date nascimentoCliente) {
        this.nascimentoCliente = nascimentoCliente;
    }

    public Integer getCelCliente() {
        return celCliente;
    }

    public void setCelCliente(Integer celCliente) {
        this.celCliente = celCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @XmlTransient
    public Collection<VendaBean> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<VendaBean> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @XmlTransient
    public Collection<EnderecoBean> getEnderecoCollection() {
        return enderecoCollection;
    }

    public void setEnderecoCollection(Collection<EnderecoBean> enderecoCollection) {
        this.enderecoCollection = enderecoCollection;
    }

    @XmlTransient
    public Collection<CarrinhoBean> getCarrinhoCollection() {
        return carrinhoCollection;
    }

    public void setCarrinhoCollection(Collection<CarrinhoBean> carrinhoCollection) {
        this.carrinhoCollection = carrinhoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpfCliente != null ? cpfCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteBean)) {
            return false;
        }
        ClienteBean other = (ClienteBean) object;
        if ((this.cpfCliente == null && other.cpfCliente != null) || (this.cpfCliente != null && !this.cpfCliente.equals(other.cpfCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Cliente[ cpfCliente=" + cpfCliente + " ]";
    }
    
}
