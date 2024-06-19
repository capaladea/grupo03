package com.unla.grupo03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unla.grupo03.model.Stock;
import com.unla.grupo03.repository.StockRepository;

public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepo;

	@Override
	public List<Stock> listar() {
		// TODO Auto-generated method stub
		return stockRepo.findAll();
	}

}
