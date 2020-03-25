package POJO;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void testSetStudentID() {
        Student studentTest = new Student();
        studentTest.setStudentID(123);
        assertTrue(studentTest.getStudentID() == 123);
    }

    @Test
    public void testSetStudentName() {
        Student studentTest = new Student();
        studentTest.setName("Artur");
        assertTrue(studentTest.getName() == "Artur");
    }

    @Test
    public void testSetStudentSurname() {
        Student studentTest = new Student();
        studentTest.setSurname("Krajewski");
        assertTrue(studentTest.getSurname() == "Krajewski");
    }

    @Test
    public void testSetStudentDateOfBirth() {
        Student studentTest = new Student();
        studentTest.setDateOfBirth("21/09/2009");
        assertTrue(studentTest.getDateOfBirth() == "21/09/2009");
    }

    @Test
    public void testGetStudentID() {
        Student studentTest = new Student();
        studentTest.setStudentID(124);
        assertTrue(studentTest.getStudentID() == 124);
    }

    @Test
    public void testGetStudentName() {
        Student studentTest = new Student();
        studentTest.setName("Błażej");
        assertTrue(studentTest.getName() == "Błażej");
    }

    @Test
    public void testGetStudentSurname() {
        Student studentTest = new Student();
        studentTest.setSurname("Polak");
        assertTrue(studentTest.getSurname() == "Polak");
    }

    @Test
    public void testGetStudentDateOfBirth() {
        Student studentTest = new Student();
        studentTest.setDateOfBirth("14/12/2008");
        assertTrue(studentTest.getDateOfBirth() == "14/12/2008");
    }
}
