package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;


public class JobTest {

//    @BeforeEach
//    public static void testCases() {
//        Job test_job1 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
//        Job test_job2 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
//        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//    }
    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        Job test_job2 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        assertNotEquals(test_job1, test_job2);
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

    }

    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        Job test_job2 = new Job("a", new Employer("b"), new Location("c"), new PositionType("d"), new CoreCompetency("e"));
        assertNotSame(test_job1, test_job2);
    }



    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_toString = new Job("Name", new Employer("Emp"), new Location("Loc"), new PositionType("Pos"), new CoreCompetency("Core"));
        assertTrue(test_toString.toString().startsWith(System.lineSeparator()));
        assertTrue(test_toString.toString().endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_toString = new Job("Name", new Employer("Emp"), new Location("Loc"), new PositionType("Pos"), new CoreCompetency("Core"));
        String jobToString = System.lineSeparator() + "ID: 1" + System.lineSeparator() + "Name: Name" + System.lineSeparator() + "Employer: Emp" + System.lineSeparator() + "Location: Loc" + System.lineSeparator() + "PositionType: Pos" + System.lineSeparator() + "CoreCompetency: Core" + System.lineSeparator();
        assertEquals(test_toString.toString(), jobToString);
    }
}
