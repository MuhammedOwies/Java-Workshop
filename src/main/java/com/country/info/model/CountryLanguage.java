package com.country.info.model;

import javax.persistence.Column;

public class CountryLanguage {
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "language")
	private String language;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
