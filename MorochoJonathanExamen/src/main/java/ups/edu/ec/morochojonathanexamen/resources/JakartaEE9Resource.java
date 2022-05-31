package ups.edu.ec.morochojonathanexamen.resources;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import ups.edu.ec.ejb.BodegaFacade;

import ups.edu.ec.ejb.ProductoFacade;
import ups.edu.ec.entidades.Bodega;

import ups.edu.ec.entidades.Producto;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE9Resource {
    
    /*
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE")
                .build();
    }*/
    
    @EJB
    private ProductoFacade ejbProduct;
    private BodegaFacade ejbBodega;
    
    
    @GET
    
    
    public Response ping(){
        
        
        
        
        Producto p2 = new Producto(6, "Aceite", "40", "3");
        ejbProduct.create(p2);
        
        /*Bodega b1= new Bodega(1, "Central", "Cuenca");
        ejbBodega.create(b1);*/
        
        
        //Error: Se debe eliminar el producto de la entidad
       // sb.removeProduct(p1);
        
        
        
        return Response
                .ok("Bodega creada con Jakarta EE")
                .build();

        
        //Se debe eliminar manualmente
   

    }
     
    /*
    
    public Response ping(){
        Bodega b1 = new Bodega(1, "bodegaPrincipal", "Azogues");
        ejbBodega.create(b1);
        
        
        //Error: Se debe eliminar el producto de la entidad
       // sb.removeProduct(p1);
        
        
        
        return Response
                .ok("Persona creada con Jakarta EE")
                .build();
        
    }
    */



}
