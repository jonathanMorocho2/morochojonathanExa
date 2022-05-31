/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.beans;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.ejb.ProductoFacade;
import ups.edu.ec.entidades.Producto;

/**
 *
 * @author USUARIO
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class productoBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @EJB
    private ProductoFacade productoFacade;
    private List<Producto> list = new ArrayList<>();
    private int id;
    private String nombre;
    private String stock;
    private String precio;

    @PostConstruct
    public void init() {	
	list = productoFacade.findAll();
    }
    
    public String add() {
         
        productoFacade.create(new Producto(id, nombre, precio, stock));
        list = productoFacade.findAll();
	return null;
    }

    public String delete(Producto prod) {
	productoFacade.remove(prod);
        list = productoFacade.findAll();
	return null;
    }

    public String edit(Producto prod) {
	prod.setEditable(true);
	return null;
    }

    public String save(Producto prod) {
        productoFacade.edit(prod);
        list = productoFacade.findAll();
	prod.setEditable(false);
	return null;
    }

    
}
