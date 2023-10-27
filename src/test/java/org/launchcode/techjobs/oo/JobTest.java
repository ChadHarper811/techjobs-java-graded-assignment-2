package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        Job test_job2 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        assertNotEquals(test_job1, test_job2);
    }

    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer());
        assertEquals("Desert", test_job.getLocation());
        assertEquals("Quality control", test_job.getPositionType());
        assertEquals("Persistence", test_job.getCoreCompetency());

    }

    public void testJobsForEquality() {
        Job test_job1 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        Job test_job2 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        assertFalse(test_job1 == test_job2);
    }

    public void testToStringStartsAndEndsWithNewLine() {
        Job test_toString = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));
        String jobToString = System.lineSeparator() + "ID: 1" + System.lineSeparator() + "Name: Name" + System.lineSeparator() + "Employer: Employer" + System.lineSeparator() + "Location: Location" + System.lineSeparator() + "PositionType: PositionType" + System.lineSeparator() + "CoreCompetency: CoreCompetency" + System.lineSeparator();
        System.out.print(jobToString);
        assertEquals(test_toString.toString(), jobToString);
    }
}
