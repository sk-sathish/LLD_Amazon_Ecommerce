package entity;

import java.util.List;

import constants.OrderStatus;
import helper.UUIDGenerator;

public class Order {
	String orderId;
	Buyer buyer;
	List<ProductItem> items;
	OrderStatus status;
	ShippingAddress shippingAddress;
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Order(Buyer buyer, List<ProductItem> items, OrderStatus status) {
		super();
		this.orderId = UUIDGenerator.generateNewUUID();
		this.buyer = buyer;
		this.items = items;
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public List<ProductItem> getItems() {
		return items;
	}
	public void setItems(List<ProductItem> items) {
		this.items = items;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
}
