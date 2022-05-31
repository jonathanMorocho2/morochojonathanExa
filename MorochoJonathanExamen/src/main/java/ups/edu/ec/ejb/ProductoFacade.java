/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ups.edu.ec.entidades.Producto;

/**
 *
 * @author USUARIO
 */
@Stateless
public class ProductoFacade extends AbstractFacade<Producto> {
    
    @PersistenceContext(name="MorochoJonathanExamen")
    private EntityManager em;
    
    public ProductoFacade(){
        super(Producto.class);
    }

    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
}
