/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.modelFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.senac.beans.mvc.VendaBean;

/**
 *
 * @author Rafael
 */
@Stateless
public class VendaBeanFacade extends AbstractFacade<VendaBean> {

    @PersistenceContext(unitName = "ProjetoPedsCalco-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VendaBeanFacade() {
        super(VendaBean.class);
    }
    
}
