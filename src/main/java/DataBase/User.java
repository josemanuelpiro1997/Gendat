package DataBase;

import java.util.ArrayList;

public class User {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private String userName;
    private ArrayList<Subject> subjects;
    private ArrayList<Event> events;

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Constructor of User class
     *
     * @param userName
     */
    public User(String userName) {
        this.userName = userName;
        this.subjects = new ArrayList<Subject>();
        this.events = new ArrayList<Event>();
    }

    //PUBLIC METHODS
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Name getter
     *
     * @return user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Subject getter
     *
     * @return Subject
     */
    public ArrayList<Subject> getAllSubjects() {
        return subjects;
    }

    /**
     * get some user's subject
     *
     * @param subjectName [String] subject name
     * @return [Subject] subject
     * @throws IllegalArgumentException
     */
    public Subject getSubject(String subjectName) {
        for (Subject subject : this.subjects) {
            if (subject.getSubjectName().equals(subjectName))
                return subject;
        }
        return null;
    }

    /**
     * Events getter
     *
     * @return Events
     */
    public ArrayList<Event> getAllEvents() {
        return events;
    }

    /**
     * get some user's event
     *
     * @param eventName [String] event name
     * @return [Event] event
     * @throws IllegalArgumentException
     */
    public Event getEvent(String eventName){
        for (Event event : this.events) {
            if (event.getEventName().equals(eventName))
                return event;
        }
        return null;
    }


    /**
     * add new user's subject
     *
     * @param subjectName [String] subject's name
     */
    public void addSubject(String subjectName) {
        Subject newSubject = new Subject(subjectName);
        this.subjects.add(newSubject);
    }

    /**
     * add new user's event
     *
     * @param eventName [String] event's name
     */
    public void addEvent(String eventName) {
        Event newEvent = new Event(eventName);
        this.events.add(newEvent);
    }


}