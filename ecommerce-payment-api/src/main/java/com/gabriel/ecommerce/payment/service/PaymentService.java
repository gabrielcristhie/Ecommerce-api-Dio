package com.gabriel.ecommerce.payment.service;

import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.gabriel.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
