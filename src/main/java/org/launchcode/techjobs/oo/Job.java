package org.launchcode.techjobs.oo;

import java.util.Objects;

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
        if (name.trim().isEmpty()) {
            name = "Data not available";
        } if (employer.getValue().trim().isEmpty()) {
            employer.setValue("Data not available");
        } if (location.getValue().trim().isEmpty()) {
            location.setValue("Data not available");
        } if (positionType.getValue().trim().isEmpty()) {
            positionType.setValue("Data not available");
        } if (coreCompetency.getValue().trim().isEmpty()) {
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

//    Custom method for unit-testing to reset ID after each test
    static void jobIdReset() {
        nextId = 1;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        if (getName() == null && getEmployer() == null && getLocation() == null && getPositionType() == null && getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        } else {return "\nID: " + getId() + "\nName: " + getName() + "\nEmployer: " + getEmployer() + "\nLocation: " + getLocation() + "\nPosition Type: " + getPositionType() + "\nCore Competency: " + getCoreCompetency() + "\n";}

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
