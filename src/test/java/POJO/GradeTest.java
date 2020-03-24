package POJO;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GradeTest {

    @Test
    public void testSetGrade() {
        Grade gradeTest = new Grade();
        gradeTest.setGrade(4);
        assertTrue(gradeTest.getGrade() == 4);
    }

    @Test
    public void testSetGradeName() {
        Grade gradeTest = new Grade();
        gradeTest.setGradeName("Egzamin");
        assertTrue(gradeTest.getGradeName() == "Egzamin");
    }

    @Test
    public void testSetGradeWage() {
        Grade gradeTest = new Grade();
        gradeTest.setGradeWage(5);
        assertTrue(gradeTest.getGradeWage() == 5);
    }

    @Test
    public void testGetGrade() {
        Grade gradeTest = new Grade();
        gradeTest.setGrade(2);
        assertTrue(gradeTest.getGrade() == 2);
    }

    @Test
    public void testGetGradeName() {
        Grade gradeTest = new Grade();
        gradeTest.setGradeName("Kartkówka");
        assertTrue(gradeTest.getGradeName() == "Kartkówka");
    }

    @Test
    public void testGetGradeWage() {
        Grade gradeTest = new Grade();
        gradeTest.setGradeWage(1);
        assertTrue(gradeTest.getGradeWage() == 1);
    }
}
