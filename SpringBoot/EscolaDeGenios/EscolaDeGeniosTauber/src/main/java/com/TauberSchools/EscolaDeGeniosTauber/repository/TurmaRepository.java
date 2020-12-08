package com.TauberSchools.EscolaDeGeniosTauber.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TauberSchools.EscolaDeGeniosTauber.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	public List<TurmaRepository> findAllByTurmaContainingIgnoreCase (String turma);

}
