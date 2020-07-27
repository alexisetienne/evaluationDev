package fr.bleu122.evaluation.dao;

import fr.bleu122.evaluation.entity.Answer;
import org.springframework.data.repository.CrudRepository;

public interface IAnswerRepository extends CrudRepository<Answer, Long> {
}
