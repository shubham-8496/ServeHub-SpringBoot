package com.cdac.servehub.service;

import com.cdac.servehub.dao.CustomerRepository;
import com.cdac.servehub.dto.Purchase;
import com.cdac.servehub.dto.PurchaseResponse;
import com.cdac.servehub.entity.Customer;
import com.cdac.servehub.entity.Order;
import com.cdac.servehub.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }


    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {

        //TASK_1 - retrieve the order info from dto

        Order order = purchase.getOrder();

        //TASK_2 -generate tracking no
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        //populate order with orderitems

        Set<OrderItem> orderItems =purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        //populate order with billing and shipping address
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());



        //populate customer with order
        Customer customer = purchase.getCustomer();
        customer.add(order);

        //save to the database
        customerRepository.save(customer);

        //return the response

        return new PurchaseResponse(orderTrackingNumber);






    }

    private String generateOrderTrackingNumber() {
        //generate random
        return UUID.randomUUID().toString();
    }
}
