/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author LUISA
 */
@Named(value = "hora")
@RequestScoped
public class Hora {

String Hora[]={"8:00","8:30","10:00","11:00","15:00","15:30","18:00"};

    public String[] getHora() {
        return Hora;
    }



    /**
     * Creates a new instance of Hora
     */
    public Hora() {
    }
    
}
