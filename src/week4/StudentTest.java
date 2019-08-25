package week4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void basicTest(){
        Student student = new Student();
        student.setCreditHoursEarned(3);
        student.setID(5678);
        student.setPoints(12);

        assertEquals(3, student.getCreditHoursEarned());
        assertEquals(5678, student.getID());
        assertEquals(12, student.getPoints());
    }

    @Test
    void checkGPA(){
        Student student = new Student();
        student.setPoints(16);
        student.setCreditHoursEarned(4);
        assertEquals((double)student.getPoints()/student.getCreditHoursEarned(), student.gpa());
    }

    @Test
    void TestStudent(){
        Student student = new Student();
        assertEquals(student.getID(), 9999);
        assertEquals(student.getCreditHoursEarned(), 3);
        assertEquals(student.getPoints(), 12);

    }
}