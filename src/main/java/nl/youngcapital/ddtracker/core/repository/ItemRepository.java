package nl.youngcapital.ddtracker.core.repository;

import nl.youngcapital.ddtracker.core.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
