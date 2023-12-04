package inmobiliaria.demo.Repocitories.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "inmueble")
public class InmuebleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    private String ciudad;
    private String pais;
    private String zona;
    private boolean llaves;
    private double area;
    private String estado;
}
