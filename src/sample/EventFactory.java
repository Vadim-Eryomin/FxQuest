package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventFactory {
    int randomDiff = 10;
    static Controller controller;
    static Event[] events = {
            new Event("Напали", "Бежать", "Отбиваться", "На вас напали двое в черном, не в вашем состоянии драться, но все же?",
                event -> {
                    controller.useEvent(new Event(
                    "Вы сбежали",
                    "Далее",
                    "Далее",
                    "Вы сбежали от этих людей. Присмотревшись вы увидели, что это были бомжи",
                    e -> controller.useNewEvent(),
                    e -> controller.useNewEvent()
                    )
                    );
                },
                event -> {
                    controller.person.update(0, 5, 0);
                    controller.useEvent(new Event(
                    "Победа",
                    "Далее",
                    "Далее",
                    "Вы отбились! \nПри ближайшем осмотрении это оказались бомжи, \nно все же вы чувствуете себя воином \n+5 xp",
                    e -> controller.useNewEvent(),
                    e -> controller.useNewEvent()
                    )
                );
                }),
            new Event("Конец",  "", "", "Ждите новых эпизодов",  null, null)
    };



    static int i = 0;
    public static Event createEvent(){
        return events[i++];
    }
}
