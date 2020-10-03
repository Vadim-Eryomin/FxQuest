package sample;

import javafx.animation.PauseTransition;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

import java.util.Arrays;

public class Controller {
    @FXML
    private Button right;

    @FXML
    Button left;

    @FXML
    TextArea gameText;

    @FXML
    Label title;

    @FXML
    Label chars;
    Person person;
    Event currentEvent;

    public Controller() {
        person = new Person(10, 1, 0, 1);
        person.controller = this;

        EventFactory.controller = this;
    }

    @FXML
    private void setEvent(Event e){
        person.update(0, 0, 0);
        title.setText(e.title);
        write(gameText, 1f, 20f, e.gameText);

        right.setText(e.rightButton);
        left.setText(e.leftButton);

        right.setOnAction(e.onRightClick);
        left.setOnAction(e.onLeftClick);
    }

    @FXML
    public void useNewEvent(){
        currentEvent = EventFactory.createEvent();
        setEvent(currentEvent);
    }

    @FXML
    public void useEvent(Event currentEvent){
        this.currentEvent = currentEvent;
        setEvent(currentEvent);
    }

    public void rightClick() {
        useNewEvent();
    }

    int lineLength = 30;
    public String formatText(String text){
        String returned = "";
        String[] data = text.split(" ");
        int length = 0;
        System.out.println(Arrays.toString(data));
        for (String word : data){
            System.out.println(word);
            System.out.println(length);
            System.out.println(word.length());
            if (length + word.length() > lineLength) {
                returned += "\n";
                length = 0;
            }
            length += word.length();
            returned += word + " ";
        }
        return returned;
    }

    public static void write(TextArea area, float delayBetweenLetters, float delayBetweenWords, String text){

//            area.setText("");
//            String[] words = text.split(" ");
//            for (String word : words){
//                String[] letters = text.split("");
//                for (String letter : letters){
//                    area.appendText(letter);
//                    try {
//                        Thread.sleep((long) delayBetweenLetters);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                area.setText(word);
//                System.out.println(area.getText());
//                System.out.println(word);
//                new PauseTransition(Duration.ONE);
//            }
        area.setText(text);
    }
}


