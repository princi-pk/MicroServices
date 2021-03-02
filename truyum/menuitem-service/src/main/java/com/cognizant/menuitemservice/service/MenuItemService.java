package com.cognizant.menuitemservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menuitemservice.MenuitemServiceApplication;
import com.cognizant.menuitemservice.dao.MenuItemDao;
import com.cognizant.menuitemservice.model.MenuItem;

@Service("menuItemService")
public class MenuItemService {
	private static Logger LOGGER = LoggerFactory.getLogger(MenuitemServiceApplication.class);

	@Autowired
	private MenuItemDao menuItemDao;

	public MenuItemDao getMenuItemDao() {
		return menuItemDao;
	}

	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}

	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemDao.getMenuItemListAdmin();

	}

	public List<MenuItem> getMenuItemListCustomer() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemDao.getMenuItemListCustomer();

	}

	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("START");
		LOGGER.info("END");
		menuItemDao.modifyMenuItem(menuItem);
	}

	public MenuItem getMenuItem(long menuItemId) {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemDao.getMenuItem(menuItemId);

	}

}
