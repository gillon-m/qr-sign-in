package com.manalastas.qrsignin.model.detail;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
