package com.currency.rate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.currency.rate.model.CurrencyExchangeModel;
import com.currency.rate.service.CurrencyExchangeService;

@RestController
@RequestMapping("/currencyconverter")
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeService currencyService;
	
	
	@GetMapping("/exchangerate")
	public List<CurrencyExchangeModel> currencyRate(@RequestParam(value="from_currecny") String from_currency, @RequestParam(value="to_currecny") String to_currency) {
		return currencyService.getExchangeRate(from_currency, to_currency);
	}

}
