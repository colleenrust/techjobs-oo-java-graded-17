package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence")
        );
        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);


        assertEquals("Product Tester", job.getName());
        assertEquals("ACME",job.getEmployer().toString());
        assertEquals("Desert", job.getLocation().toString());
        assertEquals("Quality Control", job.getPositionType().toString());
        assertEquals("Persistence", job.getCoreCompetency().toString());


    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence")

        );
        Job job2 = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence")

        );
        assertNotEquals(job1, job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence")

        );
        String jobString = job.toString();
        assertEquals(System.lineSeparator(),jobString.substring(0, System.lineSeparator().length()));
        assertEquals(System.lineSeparator(),jobString.substring(jobString.length()-System.lineSeparator().length()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence")

        );
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product Tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality Control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, job.toString());
    }
@Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job(
                "",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(expected, job.toString());
}



}

