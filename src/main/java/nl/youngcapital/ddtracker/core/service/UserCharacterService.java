package nl.youngcapital.ddtracker.core.service;

import nl.youngcapital.ddtracker.core.domain.UserCharacter;
import nl.youngcapital.ddtracker.core.repository.UserCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCharacterService {

    @Autowired
    UserCharacterRepository userCharacterRepository;

    public UserCharacter saveCharacter(UserCharacter character){
        return userCharacterRepository.save(character);
    }

    public Optional<UserCharacter> findById(Long id) {
        return userCharacterRepository.findById(id);
    }
}
