package com.events.events.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.events.entities.Events;

public interface EventDao extends JpaRepository<Events, Long> {
    
}
