package com.cognizant.menuitemservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuitemservice.MenuitemServiceApplication;
import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	private static Logger LOGGER = LoggerFactory.getLogger(MenuitemServiceApplication.class);
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping
	public List<MenuItem> getAllMenuItems() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItemListCustomer();

	}

	@GetMapping("/{id}")
	public MenuItem getMenuItems(@PathVariable long id) {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItem(id);

	}

	@PutMapping()
	public void modifyMenuItem(@RequestBody MenuItem menuItem) {
		LOGGER.info("START");
		menuItemService.modifyMenuItem(menuItem);
		LOGGER.info("END");

	}
}
