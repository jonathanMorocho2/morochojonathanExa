/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ups.edu.ec.entidades.Bodega;

/**
 *
 * @author USUARIO
 */
@Stateless
public class BodegaFacade extends AbstractFacade<Bodega> {
    
    @PersistenceContext(name="MorochoJonathanExamen")
    private EntityManager em;
    
    public BodegaFacade(){
        super(Bodega.class);
    }

    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
}