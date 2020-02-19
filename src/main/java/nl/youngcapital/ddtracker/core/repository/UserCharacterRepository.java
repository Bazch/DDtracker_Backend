package nl.youngcapital.ddtracker.core.repository;

import nl.youngcapital.ddtracker.core.domain.UserCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCharacterRepository extends CrudRepository<UserCharacter, Long> {
}
