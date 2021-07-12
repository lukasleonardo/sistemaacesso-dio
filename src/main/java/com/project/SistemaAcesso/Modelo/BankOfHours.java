package com.project.SistemaAcesso.Modelo;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BankOfHours {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class bankOfHours implements Serializable{
        private long id;
        private long idUser;
        private long idTransaction;
    }
    @EmbeddedId
    private bankOfHours id;
    private LocalDateTime daysWorked;
    private BigDecimal hourWorked;
    private BigDecimal balanceOfHoursWorked;


}
