package one.digitalinnovation.country.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.country.Country;
import one.digitalinnovation.country.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	@Autowired
	private CountryRepository countryRepository;

	@GetMapping
	public Page<Country> countries(Pageable page) {
		return countryRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Country> getOne(@PathVariable Long id) {
		Optional<Country> optional = countryRepository.findById(id);
		
		if (optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());			
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
