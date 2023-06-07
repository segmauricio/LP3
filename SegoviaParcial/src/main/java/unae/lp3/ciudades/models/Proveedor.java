package unae.lp3.ciudades.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//@Data
@Entity
@Table(name="proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ruc;
    private String email;
    private String website;

    public Proveedor() {
    }

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor(Long id, String nombre, String ruc, String email, String website) {
        this.id = id;
        this.nombre = nombre;
        this.ruc = ruc;
        this.email = email;
        this.website = website;
    }

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

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    
}
