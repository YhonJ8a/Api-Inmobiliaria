package inmobiliaria.demo.Repocitories.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "oferta")
public class OfertaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valorMaximo;
    private String valorMinimo;
    private String estdo;
    private String descripcion;
    private String categoria;
}
