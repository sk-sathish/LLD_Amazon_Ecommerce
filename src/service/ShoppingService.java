package service;

import java.util.List;

import constants.PaymentType;
import entity.Buyer;
import entity.Order;
import entity.Payment;
import entity.ProductItem;
import entity.ShippingAddress;
import entity.ShoppingCart;
import helper.PaymentStrategyHelper;

public class ShoppingService {
	public void checkOutShoppingCart(Buyer buyer, ShoppingCart cart, PaymentType paymentType, ShippingAddress address) throws Exception {
		List<ProductItem> items = cart.checkOut();
		double price = calculateThePrice(items);
		IPaymentStrategy paymentStrategy = PaymentStrategyHelper.getPaymentStrategy(paymentType);
		Payment payment = paymentStrategy.makePayment(price);
		if(!payment.isPaymentSuccessful()) {
			throw new Exception("Payment failed");
		}
		Order order = OrderService.getInstance().createOrder(items, buyer);
		buyer.addOrder(order);
		order.setShippingAddress(address);
		NotificationService notificationService = NotificationService.getInstance();
		notificationService.notifySeller(order);
	}
	public double calculateThePrice(List<ProductItem> items) {
		double price = 0;
		for(ProductItem item: items) {
			price += item.getPrice() * item.getQuantity(); 
		}
		return price;
	}
}
