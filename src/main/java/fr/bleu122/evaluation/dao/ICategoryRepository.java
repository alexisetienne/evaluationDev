package fr.bleu122.evaluation.dao;

import fr.bleu122.evaluation.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
