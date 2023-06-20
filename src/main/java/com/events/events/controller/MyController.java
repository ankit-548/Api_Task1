package com.events.events.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.events.events.entities.Events;
import com.events.events.services.EventServices;
@RestController
public class MyController {
    @Autowired
    private EventServices eventsService;
     @GetMapping("/api/v3/app/home")
    public String home() {
        return "this is home page";
    }

    // get the events
    @GetMapping("/api/v3/app/events")
    public List<Events> getEvents() {
        return this.eventsService.getEvents();
    }
    @GetMapping("/api/v3/app/events/{eventsId}")
    public Events GetEvent(@PathVariable String eventsId) {
        return this.eventsService.getEvent(Long.parseLong(eventsId));
    }

    @PostMapping("/api/v3/app/events")
    public Events addEvents(@RequestBody Events events) {
        return this.eventsService.addEvents(events);
    }    
     @PutMapping("/api/v3/app/events") 
    public Events updataEvents(@RequestBody Events events) {
        return this.eventsService.updateEvents(events);
    }
    @DeleteMapping("/api/v3/app/events/{eventsId}")
    public ResponseEntity<HttpStatus> deletEvent(@PathVariable String eventsId) {
        try {
            this.eventsService.deleteEvent(Long.parseLong(eventsId));            
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
