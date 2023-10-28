package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        if (name.trim().equals("")) {
            name = "Data not available";
        } if (employer.getValue().trim().equals("")) {
            employer.setValue("Data not available");
        } if (location.getValue().trim().equals("")) {
            location.setValue("Data not available");
        } if (positionType.getValue().trim().equals("")) {
            positionType.setValue("Data not available");
        } if (coreCompetency.getValue().trim().equals("")) {
            coreCompetency.setValue("Data not available");
        }
        else {
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
        };


    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return lineSeparator() + "ID: " + getId() + lineSeparator() + "Name: " + getName() + lineSeparator() + "Employer: " + getEmployer() + lineSeparator() + "Location: " + getLocation() + lineSeparator() + "Position Type: " + getPositionType() + lineSeparator() + "Core Competency: " + getCoreCompetency() + lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
