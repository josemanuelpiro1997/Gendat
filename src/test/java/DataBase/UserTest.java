package DataBase;

import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void getSubject() {
        User testUser = new User("joseManuel");
        String subjectName = "softIng";
        testUser.addSubject(subjectName);

        //test
        assertEquals(testUser.getSubject(subjectName).getSubjectName(),subjectName);
    }

    @org.junit.Test
    public void getEvent() {
        User testUser = new User("ivanaBelen");
        String eventName = "concurrent";
        testUser.addEvent(eventName);

        //test
        assertEquals(testUser.getEvent(eventName).getEventName(),"asd");
    }
}