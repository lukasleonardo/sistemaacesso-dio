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
public class Company {
    @Id
    private long id;
    private String description;
    private String cnpj;
    private String CompanyAddress;
    private String location;
    private String city;
    private String estate;
    private String telNumber;
}
