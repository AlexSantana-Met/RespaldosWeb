/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author LUISA
 */
public class consultaOrdenes {

 private String Tipo;
    private String Marca;
    private double Precio;
 private String Estado;

    public consultaOrdenes(String Tipo, String Marca, double Precio, String Estado) {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Estado = Estado;
    }




    public String getTipo() {
        return Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getEstado() {
        return Estado;
    }


    




}
