package com.cdac.servehub.service;

import com.cdac.servehub.dto.Purchase;
import com.cdac.servehub.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
