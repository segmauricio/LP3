/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.unae.proveedores.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Yuri
 */

@Entity
@Table(name="proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String RUC;
    private String email;
    private String web;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Proveedor() {
    }

    public Proveedor(Long id, String nombre, String RUC) {
        this.id = id;
        this.nombre = nombre;
        this.RUC = RUC;
    }

    public Proveedor(Long id, String nombre, String RUC, String email) {
        this.id = id;
        this.nombre = nombre;
        this.RUC = RUC;
        this.email = email;
    }

    public Proveedor(Long id, String nombre, String RUC, String email, String web) {
        this.id = id;
        this.nombre = nombre;
        this.RUC = RUC;
        this.email = email;
        this.web = web;
    }
    
}
