package com.manalastas.qrsignin.dao.user;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
