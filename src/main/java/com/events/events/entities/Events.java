package com.events.events.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Events {

    @Id
    private long id;
    private String type = "event";
    private String tagline;
    private String schedule;
    private String description;
    private String moderator;
    private String category;
    private String sub_category;
    private int rigor_rank;
    public Events() {
        super();
    }
    // private 
    // private int[] attendees;

    public Events(String type, long id, String tagline, String schedule, String description, String moderator,
            String category, String sub_category, int rogor_rank) {
               super();
        this.type = type;
        this.id = id;
        this.tagline = tagline;
        this.schedule = schedule;
        this.description = description;
        this.moderator = moderator;
        this.category = category;
        this.sub_category = sub_category;
        this.rigor_rank = rigor_rank;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public long getUid() {
        return id;
    }
    public void setUid(long id) {
        this.id = id;
    }
    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }
    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getModerator() {
        return moderator;
    }
    public void setModerator(String moderator) {
        this.moderator = moderator;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSub_category() {
        return sub_category;
    }
    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public int getRigor_rank() {
        return rigor_rank;
    }

    public void setRigor_rank(int rigor_rank) {
        this.rigor_rank = rigor_rank;
    }
}
