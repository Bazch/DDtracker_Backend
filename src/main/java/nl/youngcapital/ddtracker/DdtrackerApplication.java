package nl.youngcapital.ddtracker;

import nl.youngcapital.ddtracker.core.domain.Campaign;
import nl.youngcapital.ddtracker.core.domain.UserCharacter;
import nl.youngcapital.ddtracker.core.domain.Item;
import nl.youngcapital.ddtracker.core.service.CampaignService;
import nl.youngcapital.ddtracker.core.service.ItemService;
import nl.youngcapital.ddtracker.core.service.UserCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DdtrackerApplication implements ApplicationRunner {

	@Autowired
	CampaignService campaignService;
	@Autowired
	UserCharacterService userCharacterService;
	@Autowired
	ItemService itemService;


	public static void main(String[] args) {
		SpringApplication.run(DdtrackerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Campaign campaign = new Campaign("Descent into Avernus", "Max zijn campaign");
		UserCharacter Henk = new UserCharacter("Henk", 18, 12, 14, 8, 10, 12);
		UserCharacter Piet = new UserCharacter("Piet", 8, 13, 12, 16, 14, 10);
		Item bloodSpear = new Item("Bloodspear", "This spear makes someone very angry", 5000);
		Item sweatyBalls = new Item("Deck of Many Things", "MonkaS", 10000);
		itemService.saveItem(bloodSpear);
		itemService.saveItem(sweatyBalls);
		Henk.addItem(bloodSpear);
		Piet.addItem(sweatyBalls);
		userCharacterService.saveCharacter(Henk);
		userCharacterService.saveCharacter(Piet);
		Henk.removeItem(bloodSpear);
		userCharacterService.saveCharacter(Henk);
		campaign.addCharacter(Henk, Piet);
		campaign.addItem(bloodSpear, sweatyBalls);
		campaignService.updateCampaign(campaign);




	}
}
