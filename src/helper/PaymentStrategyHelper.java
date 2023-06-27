package helper;

import constants.PaymentType;
import service.CashPaymentStrategy;
import service.CreditCardPaymentStrategy;
import service.IPaymentStrategy;

public class PaymentStrategyHelper {
	public static IPaymentStrategy getPaymentStrategy(PaymentType paymentType) throws Exception {
		switch(paymentType) {
			case CASH: 
				return new CashPaymentStrategy();
			case CREDIT_CARD:
				return new CreditCardPaymentStrategy();
			default: 
				throw new Exception("invalid payment type");
		}
	}
}
