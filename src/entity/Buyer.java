package entity;

import java.util.List;

public class Buyer extends Member{
	List<Order> orders;
	List<ShippingAddress> addresses;
	ShippingAddress primaryAddress;
	ShoppingCart shoppingCart;
	public void addOrder(Order order) {
		orders.add(order);
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<ShippingAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<ShippingAddress> addresses) {
		this.addresses = addresses;
	}
	public ShippingAddress getPrimaryAddress() {
		return primaryAddress;
	}
	public void setPrimaryAddress(ShippingAddress primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
}
