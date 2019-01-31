package com.infogain.microservices.currencyexchangeservice.bean;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepoistory extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
