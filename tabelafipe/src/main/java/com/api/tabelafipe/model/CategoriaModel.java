package com.api.tabelafipe.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Table
@Data
@NoArgsConstructor
public class CategoriaModel {

    @Id
    @SequenceGenerator(
            name="categoria_sequence",
            sequenceName = "categoria_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "categoria_generator"
    )
    private Long id;

    private String nome;

    private Boolean status;

    public CategoriaModel(String nome) {
        this.nome = nome;
        this.status = true;
    }
}