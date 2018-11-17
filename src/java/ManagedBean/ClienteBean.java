/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import ManagedBean.exceptions.RollbackFailureException;
import controller.ClientesJpaController;
import entity.Clientes;
import entity.Login;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;

/**
 *
 * @author Alejandro
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean implements Serializable {

    private int idCliente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String correo;
    private Date fechaNac;
    private String direccion;
    private String ciudad;
    private String auxP;

//    public ClienteBean(int idCliente, String nombre, String apPaterno, String apMaterno, String correo, String passw, Date fechaNac, String direccion, String ciudad) {
//        this.idCliente = idCliente;
//        this.nombre = nombre;
//        this.apPaterno = apPaterno;
//        this.apMaterno = apMaterno;
//        this.correo = correo;
//        this.passw = passw;
//        this.fechaNac = fechaNac;
//        this.direccion = direccion;
//        this.ciudad = ciudad;
//    }
    /**
     * Creates a new instance of OrdenBean
     */
    public ClienteBean() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAuxP() {
        return auxP;
    }

    public void setAuxP(String auxP) {
        this.auxP = auxP;
    }

    public String registrarCliente() {
//        ClientesFacade cf = new ClientesFacade();
//        Clientes c = cf.registrarCliente(this);
//        if (c != null) {
//            FacesContext fc = FacesContext.getCurrentInstance();
//            fc.addMessage("", new FacesMessage("Registro exitoso!"));
//            return null;
//        } else {
//            FacesContext fc = FacesContext.getCurrentInstance();
//            fc.addMessage("", new FacesMessage("Ha ocurrido un error en el registro, el correo utilizado ya ha sido registrado!"));
//            return null;
//        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OpticaAndes-PrograWebPU2");
        UserTransaction utx = null;

        ClientesJpaController clientesJPA = new ClientesJpaController(utx, emf);
        int id = clientesJPA.getClientesCount();
        LoginBean nuevoLoginBean = new LoginBean(correo, auxP);
        Login nuevoLogin = nuevoLoginBean.registroLogin();
        Clientes c = null;
        if (nuevoLogin != null) {
            try {
                c = new Clientes(id, nombre, apPaterno, apMaterno, nuevoLogin);
                clientesJPA.create(c);
                return "index.xhtml";
            } catch (RollbackFailureException ex) {
                System.out.println("Error en rollback" + ex);
                return null;
            } catch (Exception ex) {
                System.out.println("Error en general" + ex);
                return null;
            }
        } else {
            System.out.println("Fuckin' Error");
            return null;
        }
    }

}