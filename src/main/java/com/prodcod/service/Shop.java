package com.prodcod.service;

import com.prodcod.domain.Order;
import org.springframework.integration.annotation.Gateway;

/**
 * Gateway interface. Provides facade to clients of the process pipeline
 * Will place all Orders into the 'orders' channel
 * 
 * @author BruceWayne
 *
 */
public interface Shop {

	@Gateway(requestChannel="ordersChannel")
	void placeOrder(Order order);

}