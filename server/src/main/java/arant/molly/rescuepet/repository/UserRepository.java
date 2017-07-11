package arant.molly.rescuepet.repository;

import arant.molly.rescuepet.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mollyarant on 7/5/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
