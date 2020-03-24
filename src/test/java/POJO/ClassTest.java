package POJO;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClassTest {

    @Test
    public void testSetClassID() {
        Class classTest = new Class();
        classTest.setClassID(1);
        assertTrue(classTest.getClassID() == 1);
    }

    @Test
    public void testSetClassNumber() {
        Class classTest = new Class();
        classTest.setClassNumber("2C");
        assertTrue(classTest.getClassNumber() == "2C");
    }

    @Test
    public void testSetClassProfileName() {
        Class classTest = new Class();
        classTest.setClassProfileName("Mat_Fiz");
        assertTrue(classTest.getClassProfileName() == "Mat_Fiz");
    }

    @Test
    public void testSetTheClassTeacher() {
        Class classTest = new Class();
        classTest.setTheClassTeacher("Agata Krzyżanowska");
        assertTrue(classTest.getTheClassTeacher() == "Agata Krzyżanowska");
    }

    @Test
    public void testGetClassID() {
        Class classTest = new Class();
        classTest.setClassID(2);
        assertTrue(classTest.getClassID() == 2);
    }

    @Test
    public void testGetClassNumber() {
        Class classTest = new Class();
        classTest.setClassNumber("3D");
        assertTrue(classTest.getClassNumber() == "3D");
    }

    @Test
    public void testGetClassProfileName() {
        Class classTest = new Class();
        classTest.setClassProfileName("Politologiczna");
        assertTrue(classTest.getClassProfileName() == "Politologiczna");
    }

    @Test
    public void testGetTheClassTeacher() {
        Class classTest = new Class();
        classTest.setTheClassTeacher("Ewa Drzyzga");
        assertTrue(classTest.getTheClassTeacher() == "Ewa Drzyzga");
    }
}
