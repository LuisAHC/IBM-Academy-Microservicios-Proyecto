package com.ibm.academia.proyecto.ejercicio1.modelos.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tarjetas_credito", schema = "ejercicio1")
//@Table(name = "tarjetas_credito")
public class TarjetaCredito implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name="minimo_salario", nullable = false)
    private Double minimoSalario;

    @Column(name="maximo_salario", nullable = true)
    private Double maximoSalario;

    @Column(name="edad_minima", nullable = false)
    private Integer edadMinima;

    @Column(name="edad_maxima", nullable = false)
    private Integer edadMaxima;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "tarjeta_pasion", schema = "ejercicio1",
            //name = "tarjeta_pasion",
            joinColumns = @JoinColumn(name = "tarjeta_id"),
            inverseJoinColumns = @JoinColumn(name = "pasion_id")
    )
    private Set<Pasion> pasiones;

    @Column(name = "usuario_creacion", nullable = false)
    private String usuarioCreacion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = true)
    private Date fechaModificacion;

    public TarjetaCredito(Long id, String nombre, Double minimoSalario, Double maximoSalario, Integer edadMinima, Integer edadMaxima, String usuarioCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.minimoSalario = minimoSalario;
        this.maximoSalario = maximoSalario;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TarjetaCredito{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", minimoSalario=").append(minimoSalario);
        sb.append(", maximoSalario=").append(maximoSalario);
        sb.append(", edadMinima=").append(edadMinima);
        sb.append(", edadMaxima=").append(edadMaxima);
        sb.append(", usuarioCreacion='").append(usuarioCreacion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaCredito that = (TarjetaCredito) o;
        return id.equals(that.id) && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @PrePersist
    private void antesPersistir(){
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void antesActualizar(){
        this.fechaModificacion = new Date();
    }
}
