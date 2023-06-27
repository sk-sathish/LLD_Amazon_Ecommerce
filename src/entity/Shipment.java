package entity;

import java.util.List;

public class Shipment {
	Order order;
	String shipmentId;
	ShippingAddress shippingAddress;
	List<ShipmentLocation> locationHistory; 
}
