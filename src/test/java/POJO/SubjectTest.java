package POJO;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubjectTest {

    @Test
    public void testSetSubjectID() {
        Subject testSubject = new Subject();
        testSubject.setSubjectID(1);
        assertTrue(testSubject.getSubjectID() == 1);
    }

    @Test
    public void testSetSubjectName() {
        Subject testSubject = new Subject();
        testSubject.setSubjectName("Przyroda");
        assertTrue(testSubject.getSubjectName() == "Przyroda");
    }

    @Test
    public void testGetSubjectID() {
        Subject testSubject = new Subject();
        testSubject.setSubjectID(3);
        assertTrue(testSubject.getSubjectID() == 3);
    }

    @Test
    public void testGetSubjectName() {
        Subject testSubject = new Subject();
        testSubject.setSubjectName("Matematyka");
        assertTrue(testSubject.getSubjectName() == "Matematyka");
    }
}
