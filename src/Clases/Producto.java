/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Cris Guerrero
 */
public class Producto {
    private int id;
    private String name;
    private String fechavn;
    private String lab;
    private int cantidad;
    private double costo;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String name, String fechavn, String lab, int cantidad, double costo, double precio) {
        this.id = id;
        this.name = name;
        this.fechavn = fechavn;
        this.lab = lab;
        this.cantidad = cantidad;
        this.costo = costo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFechavn() {
        return fechavn;
    }

    public void setFechavn(String fechavn) {
        this.fechavn = fechavn;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
