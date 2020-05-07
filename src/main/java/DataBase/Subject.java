package DataBase;

import java.util.ArrayList;

public class Subject {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private String subjectName;
    private int year;
    private ArrayList<SubjectOpt> options;

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Subject's class constructor
     *
     * @param subjectName [String] subjectName
     */
    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * get Subject's name
     *
     * @return [String] subject name
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * get Subject's year
     *
     * @return [int] subject year
     */
    public int getYear() {
        return year;
    }

    /**
     * get all Subject's options
     *
     * @return [ArrayList<SubjectOpt>] options
     */
    public ArrayList<SubjectOpt> getOptions() {
        return options;
    }

    /**
     * set Subject's year
     *
     * @param year [int] subject's year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * add option for this Subject
     *
     * @param optionNum    option number
     * @param startHour    start hour of subject
     * @param startMinute  start minute of subject
     * @param finishHour   finish hour of subject
     * @param finishMinute finish minute of subject
     * @param day          dey of subject
     */
    public void setOption(int optionNum, int startHour, int startMinute, int finishHour, int finishMinute, int day) {
        SubjectOpt newSubjectOption = new SubjectOpt(optionNum, startHour, startMinute, finishHour, finishMinute, day);
        this.options.add(newSubjectOption);
    }
}