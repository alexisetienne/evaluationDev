package fr.bleu122.evaluation.dao;

import fr.bleu122.evaluation.entity.Notes;
import org.springframework.data.repository.CrudRepository;

public interface INotesRepository extends CrudRepository<Notes, Long> {
}
