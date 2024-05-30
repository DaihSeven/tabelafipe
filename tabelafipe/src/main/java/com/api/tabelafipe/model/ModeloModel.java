package com.api.tabelafipe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class ModeloModel {

    @Id
    @SequenceGenerator(
            name="modelo_sequence",
            sequenceName = "modelo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "modelo_generator"
    )
    private Long id;

    private String nome;

    private Boolean status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca", referencedColumnName = "id")
    private MarcaModel marcaModel;

    public ModeloModel(String nome, MarcaModel marcaModel) {
        this.nome = nome;
        this.marcaModel = marcaModel;
        this.status = true;
    }

}
