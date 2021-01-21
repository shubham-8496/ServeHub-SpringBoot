package com.cdac.servehub.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    //to generate constructor using lombok we need to declare final
    private final String orderTrackingNumber;
}
