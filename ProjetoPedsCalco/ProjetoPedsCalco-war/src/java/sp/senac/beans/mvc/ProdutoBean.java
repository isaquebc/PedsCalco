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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByIdProduto", query = "SELECT p FROM Produto p WHERE p.idProduto = :idProduto")
    , @NamedQuery(name = "Produto.findByMarcaProd", query = "SELECT p FROM Produto p WHERE p.marcaProd = :marcaProd")
    , @NamedQuery(name = "Produto.findByModeloProd", query = "SELECT p FROM Produto p WHERE p.modeloProd = :modeloProd")
    , @NamedQuery(name = "Produto.findByTamanhoProd", query = "SELECT p FROM Produto p WHERE p.tamanhoProd = :tamanhoProd")
    , @NamedQuery(name = "Produto.findByCor", query = "SELECT p FROM Produto p WHERE p.cor = :cor")
    , @NamedQuery(name = "Produto.findByDescricaoPro", query = "SELECT p FROM Produto p WHERE p.descricaoPro = :descricaoPro")
    , @NamedQuery(name = "Produto.findByImagemProd", query = "SELECT p FROM Produto p WHERE p.imagemProd = :imagemProd")
    , @NamedQuery(name = "Produto.findByStatusProd", query = "SELECT p FROM Produto p WHERE p.statusProd = :statusProd")
    , @NamedQuery(name = "Produto.findByLoteProd", query = "SELECT p FROM Produto p WHERE p.loteProd = :loteProd")
    , @NamedQuery(name = "Produto.findByPrecoProd", query = "SELECT p FROM Produto p WHERE p.precoProd = :precoProd")})
public class ProdutoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "marca_prod")
    private String marcaProd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "modelo_prod")
    private String modeloProd;
    @Column(name = "tamanho_prod")
    private BigInteger tamanhoProd;
    @Size(max = 10)
    @Column(name = "cor")
    private String cor;
    @Size(max = 30)
    @Column(name = "descricao_pro")
    private String descricaoPro;
    @Size(max = 100)
    @Column(name = "imagem_prod")
    private String imagemProd;
    @Size(max = 10)
    @Column(name = "status_prod")
    private String statusProd;
    @Size(max = 30)
    @Column(name = "lote_prod")
    private String loteProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_prod")
    private Double precoProd;
    @ManyToMany(mappedBy = "produtoCollection")
    private Collection<CarrinhoBean> carrinhoCollection;
    @OneToMany(mappedBy = "idProd")
    private Collection<CarrinhoBean> carrinhoCollection1;

    public ProdutoBean() {
    }

    public ProdutoBean(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public ProdutoBean(Integer idProduto, String marcaProd, String modeloProd) {
        this.idProduto = idProduto;
        this.marcaProd = marcaProd;
        this.modeloProd = modeloProd;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public String getModeloProd() {
        return modeloProd;
    }

    public void setModeloProd(String modeloProd) {
        this.modeloProd = modeloProd;
    }

    public BigInteger getTamanhoProd() {
        return tamanhoProd;
    }

    public void setTamanhoProd(BigInteger tamanhoProd) {
        this.tamanhoProd = tamanhoProd;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricaoPro() {
        return descricaoPro;
    }

    public void setDescricaoPro(String descricaoPro) {
        this.descricaoPro = descricaoPro;
    }

    public String getImagemProd() {
        return imagemProd;
    }

    public void setImagemProd(String imagemProd) {
        this.imagemProd = imagemProd;
    }

    public String getStatusProd() {
        return statusProd;
    }

    public void setStatusProd(String statusProd) {
        this.statusProd = statusProd;
    }

    public String getLoteProd() {
        return loteProd;
    }

    public void setLoteProd(String loteProd) {
        this.loteProd = loteProd;
    }

    public Double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(Double precoProd) {
        this.precoProd = precoProd;
    }

    @XmlTransient
    public Collection<CarrinhoBean> getCarrinhoCollection() {
        return carrinhoCollection;
    }

    public void setCarrinhoCollection(Collection<CarrinhoBean> carrinhoCollection) {
        this.carrinhoCollection = carrinhoCollection;
    }

    @XmlTransient
    public Collection<CarrinhoBean> getCarrinhoCollection1() {
        return carrinhoCollection1;
    }

    public void setCarrinhoCollection1(Collection<CarrinhoBean> carrinhoCollection1) {
        this.carrinhoCollection1 = carrinhoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoBean)) {
            return false;
        }
        ProdutoBean other = (ProdutoBean) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.senac.beans.mvc.Produto[ idProduto=" + idProduto + " ]";
    }
    
}
