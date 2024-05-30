package com.api.tabelafipe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Entity
@Table
@Data
@NoArgsConstructor
public class MarcaModel {

    @Id
    @SequenceGenerator(
            name="marca_sequence",
            sequenceName = "marca_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "marca_generator"
    )
    private Long id;

    private String nome;

    private Boolean status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private CategoriaModel categoriaModel;

    public MarcaModel(String nome, CategoriaModel categoriaModel) {
        this.nome = nome;
        this.categoriaModel = categoriaModel;
        this.status = true;
    }

}