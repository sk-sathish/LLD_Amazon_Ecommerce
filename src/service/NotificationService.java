package service;

import constants.OrderStatus;
import entity.Order;

public class NotificationService {
	public static NotificationService instance;

	public static NotificationService getInstance() {
		if (instance == null) {
			instance = new NotificationService();
		}
		return instance;
	}

	private NotificationService() {

	}
	public void notifySeller(Order order) {
		
	}
	public void notifyOrderUpdate(Order order, OrderStatus status) {
		
	}
}
