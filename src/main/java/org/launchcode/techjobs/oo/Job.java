package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId ++;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    public static void main(String[] args){
//        Job jobTest = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        String jobEmployer;
//        if (jobTest.employer.getValue() == ""){
//            jobEmployer = "NOT AVA";
//        } else {
//            jobEmployer = jobTest.employer.getValue();
//        }
//        System.out.println(jobEmployer);

//    }
    public String toString() {

        String nA = "Data not available";


        //These should compare if the value is null, but I cant figure out a null constructor without errors
        String jobName;
        if (this.name == "") {
            jobName = nA;
        } else {
            jobName = this.getName();
        }

        String jobEmployer;
        if (this.employer.getValue() == ""){
            jobEmployer = nA;
        } else {
            jobEmployer = this.employer.getValue();
        }

        String jobLocation;
        if (this.location.getValue() == ""){
            jobLocation = nA;
        } else {
            jobLocation = this.location.getValue();
        }

        String jobPosition;
        if (this.positionType.getValue() == ""){
            jobPosition = nA;
        } else {
            jobPosition = this.positionType.getValue();
        }

        String jobCompetency;
        if (this.coreCompetency.getValue() == ""){
            jobCompetency = nA;
        } else {
            jobCompetency = this.coreCompetency.getValue();
        }




        String jobInfo =
                "\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + jobName + "\n" +
                "Employer: " + jobEmployer + "\n" +
                "Location: " + jobLocation + "\n" +
                "Position Type: " + jobPosition + "\n" +
                "Core Competency: " + jobCompetency + "\n";
        return jobInfo;
    }

//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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
