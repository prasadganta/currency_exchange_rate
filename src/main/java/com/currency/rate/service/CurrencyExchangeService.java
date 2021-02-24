package com.currency.rate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.currency.rate.model.CurrencyExchangeModel;
import com.currency.rate.repository.CurrencyExchangeRepo;


@Component
public class CurrencyExchangeService {
	
	
	@Autowired
	private CurrencyExchangeRepo currecnyRepo;
	
	
	public List<CurrencyExchangeModel> getExchangeRate(String from_currency,String to_currency) {
		return currecnyRepo.findByFromCurrencyToCurrency(from_currency,to_currency);
		
	}
	

}
