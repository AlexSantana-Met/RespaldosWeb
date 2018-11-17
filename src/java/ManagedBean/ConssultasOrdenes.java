/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import controller.consultaOrdenes;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author LUISA
 */
@Named(value = "cono")
@RequestScoped
public class ConssultasOrdenes {
  private final consultaOrdenes[] con = {
        new consultaOrdenes( "lentes de contacto", "liric",500,"En tramite"),
        new consultaOrdenes("lentes focales", "liric",500,"Listos para entregar"),
        new consultaOrdenes("lentes bifocales", "liric",500,"Entregados")
        
    };

    /**
     * Creates a new instance of Clientes
     */
    public ConssultasOrdenes() {
    }

    public consultaOrdenes[] getCon() {
        return con;
    }

}