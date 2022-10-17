package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobTest.getName(),"Product tester" );
        assertEquals(jobTest.getEmployer().getValue(),"ACME" );
        assertEquals(jobTest.getLocation().getValue(),"Desert" );
        assertEquals(jobTest.getPositionType().getValue(),"Quality control" );
        assertEquals(jobTest.getCoreCompetency().getValue(),"Persistence" );

        assertTrue(jobTest instanceof Job);
        assertTrue(jobTest.getEmployer() instanceof Employer);
        assertTrue(jobTest.getLocation() instanceof Location);
        assertTrue(jobTest.getPositionType() instanceof PositionType);
        assertTrue(jobTest.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job jobEq1 = new Job("QA Engineer", new Employer("Garmin"), new Location("Olathe"), new PositionType("Quality control"), new CoreCompetency("Good Swimmer"));
        Job jobEq2 = new Job("QA Engineer", new Employer("Garmin"), new Location("Olathe"), new PositionType("Quality control"), new CoreCompetency("Good Swimmer"));

        assertEquals(false, jobEq1.equals(jobEq2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testChar = String.valueOf(jobTest.toString().charAt(0));
        String testCharLast = String.valueOf(jobTest.toString().charAt(jobTest.toString().length() -1));
        assertEquals("\n", testChar);
        assertEquals("\n", testCharLast);
//        assertEquals("\n", jobTest.toString().charAt(jobTest.toString().length() -1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStringFormat =
                "\n" +
                "ID: " + jobTest.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(jobStringFormat, jobTest.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job jobTest = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        // is there a format button to line everything up??????
        String jobNoData =
                        "\n" +
        // After abstract class, each argument in Job increments ID???
                        "ID: " + jobTest.getId() + "\n" +
                        "Name: Data not available\n" +
                        "Employer: Data not available\n" +
                        "Location: Data not available\n" +
                        "Position Type: Data not available\n" +
                        "Core Competency: Data not available\n";
        assertEquals(jobNoData, jobTest.toString());
    }

}
