package com.github.alexrochatsi.citiesapi.states.repositories;

import com.github.alexrochatsi.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
