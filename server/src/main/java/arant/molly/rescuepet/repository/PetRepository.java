package arant.molly.rescuepet.repository;

import arant.molly.rescuepet.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mollyarant on 7/5/17.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
