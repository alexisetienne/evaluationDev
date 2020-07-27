package fr.bleu122.evaluation.dao;

import fr.bleu122.evaluation.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface IQuestionRepository extends CrudRepository<Question, Long> {
}
