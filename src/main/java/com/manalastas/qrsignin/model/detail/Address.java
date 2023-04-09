package com.manalastas.qrsignin.model.detail;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateProvinceRegion;
    private String postalZipCode;
}