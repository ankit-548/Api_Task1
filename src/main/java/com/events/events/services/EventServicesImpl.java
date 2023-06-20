package com.events.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.events.events.dao.EventDao;
import com.events.events.entities.Events;
@Service
public class EventServicesImpl implements EventServices{
@Autowired
private EventDao eventDao;
    @Override
    public List<Events> getEvents() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getEvents'");
        return eventDao.findAll();
    }

    @Override
    public Events getEvent(long parseLong) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getEvents'");
        
        return eventDao.getReferenceById(parseLong);
    }

    @Override
    public Events addEvents(Events events) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addEvents'");
        eventDao.save(events);
        return events;
    }

    @Override
    public Events updateEvents(Events events) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateEvents'");
        eventDao.save(events);
        return events;
    }

    @Override
    public void deleteEvent(long parseLong) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deletEvents'");
        Events entity = eventDao.getReferenceById(parseLong);
        eventDao.delete(entity);
    }
    
}
