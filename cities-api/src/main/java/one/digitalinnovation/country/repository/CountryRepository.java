package one.digitalinnovation.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.country.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
