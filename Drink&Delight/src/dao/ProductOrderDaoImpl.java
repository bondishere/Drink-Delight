package dao;
import java.util.*;
import dao.ProductOrderDao;
import model.ProductOrder;
public class ProductOrderDaoImpl implements ProductOrderDao {
@Override
public String displayProductOrder(String orderId, String deliveryStatus) {
	{
		Map<String,ProductOrder> product =new HashMap<>();
		ProductOrder order = new ProductOrder("12345","Biscuits",30.4,2.5,120.0,"24261",new Date(),"ontheway");
		ProductOrder order1 = new ProductOrder("17629","Chips",57.5,3.5,170.0,"24213",new Date(),"delivered");
		ProductOrder order2 = new ProductOrder("15321","Glasses",31.2,3.7,190.0,"23179",new Date(),"ontheway");
		ProductOrder order3 = new ProductOrder("17321","Prints",37.9,2.9,110.0,"21178",new Date(),"ontheway");
		ProductOrder order4 = new ProductOrder("15121","Beer",180.0,5,900.0,"21732",new Date(),"not delivered");
		
		product.put(order.getOrderId(), order);
		product.put(order1.getOrderId(), order1);
		product.put(order2.getOrderId(), order2);
		product.put(order3.getOrderId(), order3);
		product.put(order4.getOrderId(), order4);
		
		for(String ord:product.keySet())
		{
			if(product.get(ord).getOrderId().equalsIgnoreCase(orderId) && product.get(ord).getDeliveryStatus().equalsIgnoreCase(deliveryStatus)) {
				System.out.println(product.get(ord));
			}
	}

	return null;
}
}}