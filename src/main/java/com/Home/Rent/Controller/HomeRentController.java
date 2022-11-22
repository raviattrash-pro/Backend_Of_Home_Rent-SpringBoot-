package com.Home.Rent.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Home.Rent.Bean.TableInfoColumn;
import com.Home.Rent.Service.HomeRentService;


@RestController
public class HomeRentController {
	
	@Autowired

	 HomeRentService ss;
	
	
	@GetMapping("/rent")
	public List<TableInfoColumn> getdata() {
		return ss.detail();
	}
	
	@PostMapping("/rent")
	public String adddata( @RequestBody TableInfoColumn s) {
		return ss.add(s);
	}
	@PutMapping("/rent")
	public ResponseEntity<String> update( @RequestBody TableInfoColumn s1) {
		return ss.update(s1);
	}
	@DeleteMapping("/rent/{customerId}")
	public String delete(@PathVariable int customerId) {
		return ss.delete(customerId);
		
	}
	@GetMapping("/id/{id}")
	public TableInfoColumn getId(@PathVariable int id) {
		return ss.getId(id);
	}

}
