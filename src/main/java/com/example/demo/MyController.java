package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
@RequestMapping("/greeting")
public class MyController {


	@GetMapping("/hello")
    public String sayHello() {
        return "Hello Garima";
    }

	
	@GetMapping("/bye")
    public String saybye() {
        return "bye Garima";
    }
	
	
	@GetMapping("/helloammar")
    public String sayHelloAmar() {
        return "Hello Amar";
    }
	
	@GetMapping("/Adi")
    public String adiMsg() {
        return "Hello from Adi";
    }
	
	@GetMapping("/customerdetail")
    public Customer getCustomerDetail() {
		Customer c1 = new Customer();
		c1.setCustomerName("Feng yee");
		c1.setCustomerAge(40);
		c1.setCustomerSal(56789.45);
        return c1;
    }
	
	@GetMapping("/customerdavid")
    public Customer getCustomerDavid() {
		Customer c1 = new Customer();
		c1.setCustomerName("David");
		c1.setCustomerAge(50);
		c1.setCustomerSal(8000.00);
        return c1;
    }
	
	
   }

	






