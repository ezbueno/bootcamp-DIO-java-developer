package one.digitalinnovation.city.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.city.entities.City;
import one.digitalinnovation.city.repository.CityRepository;

@RestController
@RequestMapping("cities")
public class CityResource {

  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  /* 1st
  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }*/

  // 2nd - Pageable
  @GetMapping
  public Page<City> cities(final Pageable page) {
    return repository.findAll(page);
  }
}

