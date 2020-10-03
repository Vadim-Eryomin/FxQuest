package sample;

import javafx.fxml.FXML;

public class Person {
    Controller controller;
    int hp;
    int strength;
    int xp;
    int level;

    public Person(int hp, int strength, int xp, int level) {
        this.hp = hp;
        this.strength = strength;
        this.xp = xp;
        this.level = level;
    }

    @FXML
    public void update(int diffHp, int diffXp, int diffStrength){
        hp += diffHp;
        xp += diffXp;
        strength += diffStrength;
        controller.chars.setText("hp: "+hp+", xp: "+xp+", strength: "+strength+"");
    }

}
