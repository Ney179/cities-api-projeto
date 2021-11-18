package ccom.fernando.citiesprojetos.citiesapiprojeto.state.resources;

import ccom.fernando.citiesprojetos.citiesapiprojeto.state.entities.State;
import ccom.fernando.citiesprojetos.citiesapiprojeto.state.repositories.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> states(final Pageable page) {
        return repository.findAll(page);
    }
}

