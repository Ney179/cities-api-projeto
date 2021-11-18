package ccom.fernando.citiesprojetos.citiesapiprojeto.countries.repositories;

import ccom.fernando.citiesprojetos.citiesapiprojeto.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
