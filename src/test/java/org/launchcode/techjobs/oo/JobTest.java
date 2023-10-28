package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        Job test_job2 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        assertNotEquals(test_job1, test_job2);
        Job.jobIdReset();
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertEquals("Desert", test_job.getLocation().getValue());
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
        Job.jobIdReset();
    }

    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        Job test_job2 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        assertNotSame(test_job1, test_job2);
        Job.jobIdReset();
    }



    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_toString = new Job("Name", new Employer("Emp"), new Location("Loc"), new PositionType("Pos"), new CoreCompetency("Core"));
        assertTrue(test_toString.toString().startsWith("\n"));
        assertTrue(test_toString.toString().endsWith("\n"));
        Job.jobIdReset();
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_toString = new Job("Name", new Employer("Emp"), new Location("Loc"), new PositionType("Pos"), new CoreCompetency("Core"));
        String jobToString = "\nID: 1" + "\nName: Name" + "\nEmployer: Emp" + "\nLocation: Loc" + "\nPosition Type: Pos" + "\nCore Competency: Core\n";
        assertEquals(test_toString.toString(), jobToString);
        Job.jobIdReset();
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_emptyFieldsToString = new Job("Name", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency("Core"));
        String jobEmptyFieldsToString = "\nID: 1" + "\nName: Name" + "\nEmployer: Data not available" + "\nLocation: Data not available" + "\nPosition Type: Data not available" + "\nCore Competency: Core\n";
        assertEquals(test_emptyFieldsToString.toString(), jobEmptyFieldsToString);
        Job.jobIdReset();
    }

    @Test
    public void testToStringHandlesAllEmptyFields() {
        Job test_allEmptyFieldsToString = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobAllEmptyFieldsToString = "OOPS! This job does not seem to exist.";
        assertEquals(test_allEmptyFieldsToString.toString(), jobAllEmptyFieldsToString);
        Job.jobIdReset();
    }
}
