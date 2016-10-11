/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.modelFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.senac.beans.mvc.ProdutoBean;

/**
 *
 * @author Rafael
 */
@Stateless
public class ProdutoBeanFacade extends AbstractFacade<ProdutoBean> {

    @PersistenceContext(unitName = "ProjetoPedsCalco-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProdutoBeanFacade() {
        super(ProdutoBean.class);
    }
    
}
