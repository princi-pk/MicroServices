package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/account/{number}")
	public Account getAccountDetails(@PathVariable int number) {
		Account account=new Account(989765,"savings",234343);
		return account;
	}
}
