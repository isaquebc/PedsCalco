package sp.senac.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isaque.bcosta1
 */
@ManagedBean
@RequestScoped
public class ClienteBean extends Pessoa {

    private String email;
    private String sexo;
    private Date dtNascimento;
    private String telefone;
    private String celular;
    private List<EnderecoBean> enderecos;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<EnderecoBean> getEnderecos() {
        return enderecos;
    }

    public void setEndereco(EnderecoBean endereco) {
        enderecos.add(endereco);
    }
    public void removeEndereco(EnderecoBean endereco){
        enderecos.remove(endereco);
    }

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

}
