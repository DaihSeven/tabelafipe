package com.api.tabelafipe.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class InteresseModel {

    @Id
    @SequenceGenerator(
            name="interesse_sequence",
            sequenceName = "interesse_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interesse_generator"
    )
    private Long id;

    private String nome;

    private Boolean status;

    public InteresseModel(String nome) {
        this.nome = nome;
        this.status = true;
    }
}
