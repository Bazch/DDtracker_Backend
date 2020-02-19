package nl.youngcapital.ddtracker.core.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserCharacter {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String name;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, targetEntity = Item.class  )
    Set<Item> items = new HashSet<>();

    //CONSTRUCTORS
    public UserCharacter(){}
    public UserCharacter(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    //GETTERS&SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getConstitution() {
        return constitution;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    public Set<Item> getItems() {
        return items;
    }
    public void setItems(Set<Item> items) {
        this.items = items;
    }

    //METHODS

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

    @Override
    public String toString() {
        return name;
    }
}
