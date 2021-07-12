package com.project.SistemaAcesso.Modelo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocurrence {
    @Id
    private long id;
    private String nome;
    private String description;

}
