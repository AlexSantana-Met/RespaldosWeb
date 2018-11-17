/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alejandro
 */
@Named(value = "citaBean")
@RequestScoped
public class CitaBean implements Serializable {

    /**
     * Creates a new instance of CitaBean
     */
    public CitaBean() {
    }
    
}
