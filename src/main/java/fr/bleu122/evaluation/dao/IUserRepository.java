package fr.bleu122.evaluation.dao;

import fr.bleu122.evaluation.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, String > {
}
