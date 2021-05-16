package com.github.nathaliarsilva.citiesapi.states.repositories;

import com.github.nathaliarsilva.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
