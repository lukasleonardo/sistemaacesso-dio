package com.project.SistemaAcesso.Modelo;

import lombok.*;


import javax.persistence.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
