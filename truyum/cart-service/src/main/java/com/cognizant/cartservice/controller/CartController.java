package com.cognizant.cartservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.cartservice.CartServiceApplication;
import com.cognizant.cartservice.exception.CartEmptyException;
import com.cognizant.cartservice.model.Cart;
import com.cognizant.cartservice.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	private static Logger LOGGER = LoggerFactory.getLogger(CartServiceApplication.class);
	@Autowired
	private CartService cartService;

	@PostMapping("/{userId}/{menuItemId}")
	public void addCartItem(@PathVariable String userId, @PathVariable long menuItemId) {
		LOGGER.info("START");
		LOGGER.info("END");
		cartService.addCartItem(userId, menuItemId);

	}

	@GetMapping("/{userId}")
	public Cart getAllCartItem(@PathVariable String userId) throws CartEmptyException {
		LOGGER.info("START");
		LOGGER.info("END");
		return cartService.getAllCartItems(userId);

	}

	@DeleteMapping("/{userId}/{menuItemId}")
	public void deleteCartItem(@PathVariable String userId, @PathVariable long menuItemId) throws CartEmptyException {
		LOGGER.info("START");
		LOGGER.info("END");
		cartService.removeCartItem(userId, menuItemId);

	}
}
