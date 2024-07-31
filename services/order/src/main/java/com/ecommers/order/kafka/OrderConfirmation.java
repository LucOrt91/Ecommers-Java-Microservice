package com.ecommers.order.kafka;

import com.ecommers.order.customer.CustomerResponse;
import com.ecommers.order.order.PaymentMethod;
import com.ecommers.order.product.PurchaseResponse;

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
