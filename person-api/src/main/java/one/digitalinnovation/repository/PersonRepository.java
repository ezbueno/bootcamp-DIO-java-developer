package one.digitalinnovation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
