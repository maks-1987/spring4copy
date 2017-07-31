package com.pluralsight.controller;

import com.pluralsight.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsReporController {

    @RequestMapping("/events")
    public List<Event> getEvents() {

        //Так в уроке, но компилятор ругактся
        // List<Event> events = new ArrayList<>();
        List<Event> events = new ArrayList<Event>();
        Event event1 = new Event();
        event1.setName("Java User Group");
        events.add(event1);

        Event event2 = new Event();
        event2.setName("Angular User Group");
        events.add(event2);

        return events;

    }

}
