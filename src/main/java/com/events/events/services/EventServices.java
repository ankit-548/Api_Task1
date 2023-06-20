package com.events.events.services;

import java.util.List;

import com.events.events.entities.Events;

public interface EventServices {
    public List<Events> getEvents();
    public Events getEvent(long parseLong);
    public Events addEvents(Events events);
    public Events updateEvents(Events events);
    public void deleteEvent(long parseLong);
}
