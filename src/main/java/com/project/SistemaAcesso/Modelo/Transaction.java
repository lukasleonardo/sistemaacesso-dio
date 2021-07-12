package com.project.SistemaAcesso.Modelo;


import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name="Movimentacao")
public class Transaction {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class idTransaction implements Serializable {
        private long id;
        private long usuario;
    }
    @Id
    @EmbeddedId
    private idTransaction id;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private BigDecimal period;
    @ManyToOne
    private Ocurrence ocurrence;
    @ManyToOne
    private Calendar date;

}
