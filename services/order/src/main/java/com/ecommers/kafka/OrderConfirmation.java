package com.ecommers.kafka;

import com.ecommers.customer.CustomerResponse;
import com.ecommers.order.PaymentMethod;
import com.ecommers.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
