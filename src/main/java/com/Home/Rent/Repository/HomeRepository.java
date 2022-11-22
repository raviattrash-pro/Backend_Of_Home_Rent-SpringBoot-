package com.Home.Rent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Home.Rent.Bean.TableInfoColumn;

public interface HomeRepository extends JpaRepository<TableInfoColumn, Integer>{

}
