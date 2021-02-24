package com.currency.rate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.currency.rate.model.CurrencyExchangeModel;

public interface CurrencyExchangeRepo extends CrudRepository<CurrencyExchangeModel, Integer> {

	
	
	List<CurrencyExchangeModel> findByFromCurrency(String from_currency);
	
	@Query("SELECT c from CurrencyExchangeModel c where from_currency=:from_currency and to_currency=:to_currency")
	List<CurrencyExchangeModel> findByFromCurrencyToCurrency(@Param("from_currency") String from_currency,@Param("to_currency") String to_currency);
}
