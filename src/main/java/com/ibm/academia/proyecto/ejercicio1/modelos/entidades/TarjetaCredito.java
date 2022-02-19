package com.ibm.academia.proyecto.ejercicio1.modelos.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tarjetas_credito", schema = "ejercicio1")
public class TarjetaCredito implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name="minimo_salario")
    private Double minimoSalario;

    @Column(name="maximo_salario")
    private Double maximoSalario;

    @Column(name="edad_minima")
    private Integer edadMinima;

    @Column(name="edad_maxima")
    private Integer edadMaxima;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "pasion_id", foreignKey = @ForeignKey(name = "FK_PASION_ID"))
    private Pasion pasion;

    @Column(name = "usuario_creacion", nullable = false)
    private String usuarioCreacion;

    @Column(name = "fecha_creacion", nullable = true)
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
}
