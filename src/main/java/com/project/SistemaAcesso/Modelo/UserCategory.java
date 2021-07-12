package com.project.SistemaAcesso.Modelo;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class UserCategory {
    @Id
    private long id;
    private String description;
}
