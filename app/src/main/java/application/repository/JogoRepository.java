package application.repository;
import org.springframework.data.repository.CrudRepository;

import application.model.Jogo;

public interface CategoriaRepository extends CrudRepository<Jogo, Long> {

}