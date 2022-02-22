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
@Table(name = "pasiones", schema = "ejercicio1")
//@Table(name = "pasiones")
public class Pasion implements Serializable {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "pasiones", fetch = FetchType.LAZY)
    private Set<TarjetaCredito> tarjetasCredito;

    @Column(name = "usuario_creacion", nullable = false)
    private String usuarioCreacion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = true)
    private Date fechaModificacion;

    public Pasion(Long id, String nombre, Set<TarjetaCredito> tarjetasCredito, String usuarioCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.tarjetasCredito = tarjetasCredito;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pasion{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tarjetasCredito=").append(tarjetasCredito);
        sb.append(", usuarioCreacion=").append(usuarioCreacion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasion pasion = (Pasion) o;
        return id.equals(pasion.id) && nombre.equals(pasion.nombre);
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
