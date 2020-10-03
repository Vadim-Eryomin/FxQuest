package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Event {
    public String title;
    public String leftButton;
    public String rightButton;
    public String gameText;
    public EventHandler<ActionEvent> onLeftClick;
    public EventHandler<ActionEvent> onRightClick;

    public Event(String title, String leftButton, String rightButton, String gameText, EventHandler<ActionEvent> onLeftClick, EventHandler<ActionEvent> onRightClick){
        this.title = title;
        this.leftButton = leftButton;
        this.rightButton = rightButton;
        this.onLeftClick = onLeftClick;
        this.onRightClick = onRightClick;
        this.gameText = gameText;
    }
}
