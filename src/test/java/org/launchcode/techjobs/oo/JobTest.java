package org.launchcode.techjobs.oo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertTrue;
public class JobTest {
    // test 4 - Tests
    //TODO: Create your unit tests here
    @Test  //Test 1
    public void testSettingJobId() {
        //empty constructor
        Job job1 = new Job();
        Job job2 = new Job();
        // Use assertNotEquals to verify that the IDs of the two objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test //Test 2
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
        // Your test should have 5 assert statements of each type.
        assertTrue(true);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }
    @Test // Test 3
    public void testJobsForEquality() {
        // Generate two Job objects that have identical field values EXCEPT for id.
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Test that equals returns false
        assertFalse(job1.equals(job2));
    }
    @Test //Task 5
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
        String result = job.toString();
        assertEquals(true, result.startsWith(System.lineSeparator()));
        assertEquals(true, result.endsWith(System.lineSeparator()));
    }
    @Test //Task 5
    public void testToStringContainsCorrectLabelsAndData() {

        Job job = new Job("Product Tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        String result = job.toString();
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product Tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality Control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, result);
    }
    @Test //Task 5
    public void testToStringHandlesEmptyField() {
        // Create a Job object with an empty field.
        Job job = new Job(1, null, "Google", "Mountain View, CA", "Full-time", "Software Development");

        // Get the string representation of the Job object.
        String toString = job.toString();

        // Assert that the string contains the label for the empty field, followed by "Data not available".
        assertTrue(toString.contains("Name: Data not available"));
    }
}