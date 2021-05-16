package com.github.nathaliarsilva.citiesapi.countries.repositories;

import com.github.nathaliarsilva.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
