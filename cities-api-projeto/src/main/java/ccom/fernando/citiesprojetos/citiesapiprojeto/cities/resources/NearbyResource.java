package ccom.fernando.citiesprojetos.citiesapiprojeto.cities.resources;

import java.util.List;

import ccom.fernando.citiesprojetos.citiesapiprojeto.cities.entities.City;
import ccom.fernando.citiesprojetos.citiesapiprojeto.cities.service.DistanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nearby")
public class NearbyResource {

    private DistanceService distanceService;

    public NearbyResource(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping
    public List<City> nearby(@RequestParam(name = "city_id") final Long cityId,
                             @RequestParam(name = "radius") final Double radius) {

        return distanceService.nearby(cityId, radius);
    }
}

