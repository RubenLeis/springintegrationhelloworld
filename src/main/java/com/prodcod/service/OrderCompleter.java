package com.prodcod.service;

import com.prodcod.domain.Order;
import com.prodcod.domain.OrderItem;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Receives the collection of order items that have been processed
 * for the discount reduction.
 * 
 * @author BruceWayne
 *
 */
public class OrderCompleter {
	
	private static final Logger log = Logger.getLogger(OrderCompleter.class);

	public Order prepareDelivery(List<OrderItem> orderItems) {
		final Order order = new Order();
		order.setOrderItems(orderItems);
		
//		log.debug("*** [OrderCompleter] CompletedOrder : "
//		+ order +" ****");

		log.debug("*** [OrderCompleter] CompletedOrder Discounted cost: "
		+ order.getTotalDiscountedCost() +" ****");

		return order;
	}
}
