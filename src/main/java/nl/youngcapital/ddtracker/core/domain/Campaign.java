package nl.youngcapital.ddtracker.core.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Campaign {

    //VARIABLES
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String title;
    String description;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, targetEntity = UserCharacter.class  )
    Set<UserCharacter> userCharacters = new HashSet<>();

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, targetEntity = Item.class )
    Set<Item> items = new HashSet<>();

    //CONSTRUCTORS
    public Campaign(){}
    public Campaign(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //GETTERS&SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<UserCharacter> getUserCharacters() {
        return userCharacters;
    }
    public void setUserCharacters(Set<UserCharacter> userCharacters) {
        this.userCharacters = userCharacters;
    }
    public Set<Item> getItems() {
        return items;
    }
    public void setItems(Set<Item> items) {
        this.items = items;
    }

    //METHODS
    public void addCharacter(UserCharacter... userCharacter){
        for(UserCharacter c: userCharacter){
            this.userCharacters.add(c);
        }
    }
    public void removeCharacter(UserCharacter... userCharacter){
        for(UserCharacter c: userCharacter){
            this.userCharacters.remove(c);
        }
    }
    public void addItem(Item... item){
        for(Item i: item){
            this.items.add(i);
        }
    }
    public void removeItem(Item... item){
        for(Item i: item){
            this.items.remove(i);
        }
    }
}
