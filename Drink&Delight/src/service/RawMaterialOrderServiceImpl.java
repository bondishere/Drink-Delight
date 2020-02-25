package service;

import dao.RawMaterialOrderDaoImpl;

public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {

		@Override
		public String displayOrder(String supplierId, String deliveryStatus) {
			RawMaterialOrderDaoImpl rawMaterialOrderDaoImplObj=new RawMaterialOrderDaoImpl();
			
			return rawMaterialOrderDaoImplObj.displayOrder(supplierId, deliveryStatus) ;
		}

}