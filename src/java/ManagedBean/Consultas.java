/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Control.Consulta;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alejandro
 */
@Named(value = "con")
@RequestScoped
public class Consultas {

    private final Consulta[] con = {
        new Consulta(new java.util.Date(), "Necesito una cita para chequeo de ojos", "Atendida", "Recuerde tomar el medicamento"),
        new Consulta(new java.util.Date(), "Agendo cita para revisar mi retina", "Atendida", "Recuerde tomar el medicamento"),
        new Consulta(new java.util.Date(), "Cita para cambio de lentes", "Pendiente", ""),
        new Consulta(new java.util.Date(), "Cita para pago de lentes", "Pendiente", "")
    };

    /**
     * Creates a new instance of Clientes
     */
    public Consultas() {
    }

    public Consulta[] getCon() {
        return con;
    }

}
