package models;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "marca")
@Getter
@Setter
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToMany
    private int id;
    Set<Producto> marca_id;
    
    private String nombre;
}
