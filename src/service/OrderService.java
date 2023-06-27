package service;

import java.util.ArrayList;
import java.util.List;

import constants.OrderStatus;
import entity.Buyer;
import entity.Order;
import entity.ProductItem;

public class OrderService {
	List<Order> activeOrders;
	public static OrderService instance;
	public static OrderService getInstance() {
		if(instance == null) {
			instance = new OrderService();
		}
		return instance;
	}
	private OrderService() {
		this.activeOrders = new ArrayList<Order>();
	}
	public Order createOrder(List<ProductItem> items, Buyer buyer) {
		Order order = new Order(buyer, items, OrderStatus.ACCEPTED);
		activeOrders.add(order);
		return order;
	}
	public void updateOrder(Order order, OrderStatus orderStatus) {
		NotificationService service = NotificationService.getInstance();
		service.notifyOrderUpdate(order, orderStatus);
		order.setStatus(orderStatus);
		
	}
}
