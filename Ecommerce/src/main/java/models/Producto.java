package models;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String descripcion;
    private int marca_id;
    private int empresa_id;
    private float tamano_pantalla;
    private int memoria_almacenamiento;
    private int memoria_ram;
    private String sistema_operativo;
    private String procesador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }

    public float getTamano_pantalla() {
        return tamano_pantalla;
    }

    public void setTamano_pantalla(float tamano_pantalla) {
        this.tamano_pantalla = tamano_pantalla;
    }

    public int getMemoria_almacenamiento() {
        return memoria_almacenamiento;
    }

    public void setMemoria_almacenamiento(int memoria_almacenamiento) {
        this.memoria_almacenamiento = memoria_almacenamiento;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    
}
