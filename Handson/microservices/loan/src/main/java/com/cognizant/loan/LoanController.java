package com.cognizant.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@GetMapping("/loans/{number}")
	public Loan getLoanAccountDetails(@PathVariable String number) {
		Loan loan=new Loan("H00987","car",400000,3258,18);
		return loan;
	}
}
