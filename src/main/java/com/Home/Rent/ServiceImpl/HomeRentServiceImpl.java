package com.Home.Rent.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Home.Rent.Bean.TableInfoColumn;
import com.Home.Rent.ExceptionHandler.HomeRentExceptionHandler;
import com.Home.Rent.Repository.HomeRepository;
import com.Home.Rent.Service.HomeRentService;

@Service
public  class HomeRentServiceImpl implements HomeRentService {
	
	@Autowired
	HomeRepository homerepo;
	@Override
	public List<TableInfoColumn> detail() {
		return homerepo.findAll();
	}

	@Override
	public String add(TableInfoColumn sd) {
		homerepo.save(sd);
		return "added";
	}

	@Override
	public ResponseEntity<String> update(TableInfoColumn s) {
		homerepo.save(s);
		return new ResponseEntity<>("Update",HttpStatus.BAD_REQUEST);
	}

	@Override
	public String delete(int customerId) {
		homerepo.deleteById(customerId);
		return "deleted";
	}

	@Override
	public TableInfoColumn getId(int customerId) {
		return homerepo.findById(customerId).orElseThrow(()-> new HomeRentExceptionHandler("id not found"));
	}

}
