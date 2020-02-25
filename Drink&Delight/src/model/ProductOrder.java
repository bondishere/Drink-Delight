package model;
import java.util.Date;
public class ProductOrder {
	String orderId;
	String name;
	double pricePerUnit;
	double quantityUnit;
	double price;
	String wareouseId;
	Date deliveryDate;
	String deliveryStatus;
	public ProductOrder() {
		super();
	}

	public ProductOrder(String orderId,String name, double pricePerUnit, double quantityUnit, double price,
			String wareouseId, Date deliveryDate, String deliveryStatus) {
		super();
		this.orderId =orderId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.wareouseId = wareouseId;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	
	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWareouseId() {
		return wareouseId;
	}

	public void setWareouseId(String wareouseId) {
		this.wareouseId = wareouseId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	
	@Override
	public String toString() {
		return "ProductOrder\n [orderId=" + orderId + ", \nname=" + name + ", \npricePerUnit=" + pricePerUnit
				+ "," + "\n quantityUnit=" + quantityUnit + ",\n price=" + price
				+ ", \nwareouseId=" + wareouseId + ",\n deliveryDate=" + deliveryDate + ",\ndeliveryStatus = " +deliveryStatus+"]";
	}
}