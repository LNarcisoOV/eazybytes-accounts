package com.ms.accounts.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

    @Id
    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String address;
}
