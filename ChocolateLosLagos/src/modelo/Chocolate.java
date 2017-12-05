/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author felip
 */
public class Chocolate {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int precioVenta;
    private int cantidad;
    private char tipoChocolate;
    private String saborChocolate;
    private String marca;
    private boolean azucar;
    
    public Chocolate(){
        
    }

    public Chocolate(int codigo, String nombre, String descripcion, int precioVenta, int cantidad, char tipoChocolate, String saborChocolate, String marca, boolean azucar) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.tipoChocolate = tipoChocolate;
        this.saborChocolate = saborChocolate;
        this.marca = marca;
        this.azucar = azucar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public char getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(char tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }

    public String getSaborChocolate() {
        return saborChocolate;
    }

    public void setSaborChocolate(String saborChocolate) {
        this.saborChocolate = saborChocolate;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAzucar() {
        return this.azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }
    
    
    
}
