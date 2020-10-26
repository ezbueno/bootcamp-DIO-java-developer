package one.digitalinnovation.state.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.state.State;

public interface StateRepository extends JpaRepository<State, Long>{
}
