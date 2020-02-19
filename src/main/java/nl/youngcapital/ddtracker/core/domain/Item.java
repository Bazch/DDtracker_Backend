package nl.youngcapital.ddtracker.core.domain;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String name;
    String description;
    int value;

    //CONSTRUCTORS
    public Item(){}
    public Item(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    //METHODS

    @Override
    public String toString() {
        return "NAME: "+name+" DESCRIPTION: "+description+"";
    }
}
