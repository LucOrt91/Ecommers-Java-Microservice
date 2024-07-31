package com.ecommers.order.payment;

import com.ecommers.order.customer.CustomerResponse;
import com.ecommers.order.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
