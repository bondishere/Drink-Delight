package dao;
import java.util.*;
import dao.RawMaterialOrderDao;
import model.RawMaterialOrder;

public class RawMaterialOrderDaoImpl implements RawMaterialOrderDao {
		@Override
		public String displayOrder(String supplierId, String deliveryStatus) {
		 Map<String,RawMaterialOrder> raws =new HashMap<>();
			
			@SuppressWarnings("deprecation")
			RawMaterialOrder order=new RawMaterialOrder("53553","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");
			RawMaterialOrder order1=new RawMaterialOrder("56243","salt","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"ontheWay","464");
			RawMaterialOrder order11=new RawMaterialOrder("56245","Tea powder","602136",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"delivered","434");
			RawMaterialOrder order12=new RawMaterialOrder("56243","coffee powder","602824",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"delivered","414");
			RawMaterialOrder order13=new RawMaterialOrder("56243","milk","612424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"not delivered","404");
			
			raws.put(order.getOrderId(), order);
			raws.put(order1.getOrderId(), order1);
			raws.put(order11.getOrderId(), order11);
			raws.put(order12.getOrderId(), order12);
			raws.put(order13.getOrderId(), order13);
			 for(String ord:raws.keySet())
				{
					if(raws.get(ord).getSupplierId().equalsIgnoreCase(supplierId) && raws.get(ord).getDeliveryStatus().equalsIgnoreCase(deliveryStatus)) {
						System.out.println(raws.get(ord));
					}
		 }
			 return null;
		}
		}