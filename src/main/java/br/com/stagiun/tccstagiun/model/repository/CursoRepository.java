package br.com.stagiun.tccstagiun.model.repository;

import br.com.stagiun.tccstagiun.model.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
