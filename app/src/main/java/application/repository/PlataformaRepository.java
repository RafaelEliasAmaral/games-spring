package application.repository;
import org.springframework.data.repository.CrudRepository;

import application.model.Plataforma;

public interface CategoriaRepository extends CrudRepository<Plataforma, Long> {

}