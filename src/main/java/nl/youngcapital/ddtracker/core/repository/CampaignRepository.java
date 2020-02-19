package nl.youngcapital.ddtracker.core.repository;

import nl.youngcapital.ddtracker.core.domain.Campaign;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends CrudRepository<Campaign, Long> {
}
