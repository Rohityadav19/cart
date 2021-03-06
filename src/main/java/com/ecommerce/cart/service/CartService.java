package com.ecommerce.cart.service;

import java.util.List;

import com.ecommerce.cart.model.Cart;

public interface CartService {
	Cart addToCart(String email,int item);
	
	
	List<Cart> getCartByUserId(String email);
	

	Cart removeFromCart(String email, int itemId);

	Cart removeOneItemFromCart(String email, int itemId);

	int getCartCount(String email);
}
