package com.gabriel.ecommerce.checkout.service;

import com.gabriel.ecommerce.checkout.resource.checkout.CheckoutRequest;
import com.gabriel.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
