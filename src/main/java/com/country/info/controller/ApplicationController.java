package com.country.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.country.info.model.Country;
import com.country.info.repo.CountryRepository;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@Autowired
	CountryRepository repository;

	@RequestMapping(value = "/{countryCode}", method = RequestMethod.GET,produces = { "application/json" })
	public Country getCountry(@PathVariable String countryCode) {
		Country country = repository.findByCode(countryCode);
		return country;
	}
}
