/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetsky.jpa.sessions;

import com.jetsky.jpa.entities.TipoClientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bratc
 */
@Stateless
public class TipoClientesFacade extends AbstractFacade<TipoClientes> {

    @PersistenceContext(unitName = "jetsky_g_JetSky_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoClientesFacade() {
        super(TipoClientes.class);
    }
    
}
