package com.project.SistemaAcesso.Modelo;

import lombok.*;
import org.hibernate.envers.Audited;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited //gera uma auditação da tabela caso a mesma possua referencia de outras tabelas as mesmas também precisam ser auditadas.
@Table(name="Usuario")
public class User {

    @Id
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String nome;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingDay workingDay;
    private BigDecimal delayTolerance;
    private LocalDateTime workingDayStart;
    private LocalDateTime workingDayEnd;

}
