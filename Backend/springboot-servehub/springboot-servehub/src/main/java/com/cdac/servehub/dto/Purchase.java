package com.cdac.servehub.dto;

import com.cdac.servehub.entity.Address;
import com.cdac.servehub.entity.Customer;
import com.cdac.servehub.entity.Order;
import com.cdac.servehub.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
