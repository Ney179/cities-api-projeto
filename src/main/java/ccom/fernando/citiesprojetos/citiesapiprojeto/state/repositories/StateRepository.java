package ccom.fernando.citiesprojetos.citiesapiprojeto.state.repositories;


import ccom.fernando.citiesprojetos.citiesapiprojeto.state.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
