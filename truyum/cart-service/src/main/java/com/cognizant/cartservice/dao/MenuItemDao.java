package com.cognizant.cartservice.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.cartservice.model.MenuItem;

@Component
public interface MenuItemDao {
	public List<MenuItem> getMenuItemListAdmin();

	List<MenuItem> getMenuItemListCustomer();

	void modifyMenuItem(MenuItem menuItem);

	MenuItem getMenuItem(long menuItemId);

}
