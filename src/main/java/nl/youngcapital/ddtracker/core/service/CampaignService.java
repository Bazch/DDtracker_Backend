package nl.youngcapital.ddtracker.core.service;

import nl.youngcapital.ddtracker.core.domain.Campaign;
import nl.youngcapital.ddtracker.core.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampaignService {
    @Autowired
    CampaignRepository campaignRepository;

    public Campaign createCampaign(String title, String description){
        Campaign campaign = new Campaign(title, description);
        return campaignRepository.save(campaign);
    }

    public Campaign updateCampaign(Campaign campaign){
        return campaignRepository.save(campaign);
    }

    public Optional<Campaign> findById(Long id) {
        return campaignRepository.findById(id);
    }

}
