package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        Job test_job2 = new Job("name", new Employer("emp"), new Location("loc"), new PositionType("pos"), new CoreCompetency("core"));
        assertNotEquals(test_job1, test_job2);
    }

}
