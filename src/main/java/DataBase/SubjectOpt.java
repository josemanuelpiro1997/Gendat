package DataBase;

public class SubjectOpt extends EventOpt {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private String teacherName;
    private int classroomNumber;

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * SubjectOpt's class constructor
     *
     * @param optionNum    option number
     * @param startHour    start hour of subject
     * @param startMinute  start minute of subject
     * @param finishHour   finish hour of subject
     * @param finishMinute finish minute of subject
     * @param day          dey of subject
     */
    public SubjectOpt(int optionNum, int startHour, int startMinute, int finishHour, int finishMinute, int day) {
        super(optionNum, startHour, startMinute, finishHour, finishMinute, day);
    }

    //PUBLIC METHODS
    //------------------------------------------------------------------------------------------------------------------

    /**
     * set teacher's name
     *
     * @param name [String] teacher name
     */
    public void setTeacherName(String name){
        this.teacherName = teacherName;
    }

    /**
     * set classroom number
     *
     * @param classroomNumber [int] classroom numbre
     */
    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    /**
     * get teacher name
     *
     * @return [String] teacher's name
     */
    public String getTeacherName(){
        return this.teacherName;
    }

    /**
     * set classrom number
     *
     * @return [int] classroom number
     */
    public int getClassroomNumber() {
        return classroomNumber;
    }
}