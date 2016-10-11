/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans.mvc;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
    , @NamedQuery(name = "Fornecedor.findByIdForecedor", query = "SELECT f FROM Fornecedor f WHERE f.idForecedor = :idForecedor")
    , @NamedQuery(name = "Fornecedor.findByRazaoSocial", query = "SELECT f FROM Fornecedor f WHERE f.razaoSocial = :razaoSocial")
    , @NamedQuery(name = "Fornecedor.findByCnpjFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cnpjFornecedor = :cnpjFornecedor")
    , @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor")})
public class FornecedorBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_forecedor")
    private Integer idForecedor;
    @Size(max = 50)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 17)
    @Column(name = "cnpj_fornecedor")
    private String cnpjFornecedor;
    @Size(max = 30)
    @Column(name = "email_fornecedor")
    private String emailFornecedor;

    public FornecedorBean() {
    }

    public FornecedorBean(Integer idForecedor) {
        this.idForecedor = idForecedor;
    }

    public FornecedorBean(Integer idForecedor, String cnpjFornecedor) {
        this.idForecedor = idForecedor;
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public Integer getIdForecedor() {
        return idForecedor;
    }

    public void setIdForecedor(Integer idForecedor) {
        this.idForecedor = idForecedor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idForecedor != null ? idForecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FornecedorBean)) {
            return false;
        }
        FornecedorBean other = (FornecedorBean) object;
        if ((this.idForecedor == null && other.idForecedor != null) || (this.idForecedor != null && !this.idForecedor.equals(other.idForecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Fornecedor[ idForecedor=" + idForecedor + " ]";
    }
    
}
