package com.Home.Rent.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.Home.Rent.Bean.TableInfoColumn;

public interface HomeRentService {
	public List<TableInfoColumn>detail();
	public String add(TableInfoColumn sd);
	public ResponseEntity<String> update(TableInfoColumn s);
	public String delete(int customerId);
	TableInfoColumn getId(int customerId);

}
