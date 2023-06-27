package service;

import entity.Payment;

public interface IPaymentStrategy {
	public Payment makePayment(double price);
}
