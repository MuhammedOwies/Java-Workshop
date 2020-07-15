package com.country.info.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.country.info.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	@Query("SELECT c.*,cl.language FROM country c join countrylanguage cl on c.code = cl.countryCode")
	Country findByCode(String countryCode);
}
