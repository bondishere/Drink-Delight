package service;

import dao.ProductOrderDaoImpl;

public class ProductOrderServiceImpl implements ProductOrderService 
{
	@Override
	public String displayProductOrder(String orderId,String deliveryStatus){
		ProductOrderDaoImpl ProductOrderDaoImplObj=new ProductOrderDaoImpl();
		return ProductOrderDaoImplObj.displayProductOrder(orderId, deliveryStatus) ;
	}
}