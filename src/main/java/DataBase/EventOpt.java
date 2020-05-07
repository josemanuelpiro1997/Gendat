package DataBase;

public class EventOpt {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private int optionNum;
    private int day;
    private int startHour;
    private int startMinute;
    private int finishHour;
    private int finishMinute;


    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * EventOpt's class constructor
     *
     * @param optionNum    [int] option number
     * @param startHour    [int] start hour of subject
     * @param startMinute  [int] start minute of subject
     * @param finishHour   [int] finish hour of subject
     * @param finishMinute [int] finish minute of subject
     * @param day          [int] day of subject
     */
    public EventOpt(int optionNum, int startHour, int startMinute, int finishHour, int finishMinute, int day) {
        this.optionNum = optionNum;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.finishHour = finishHour;
        this.finishMinute = finishMinute;
        this.day = day;
    }

    /**
     * Get index of option
     *
     * @return [int] index
     */
    public int getOptionNum() {
        return optionNum;
    }

    /**
     * Get start hour
     *
     * @return [int] hours
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Get start minute
     *
     * @return [int] minute
     */
    public int getStartMinute() {
        return startMinute;
    }

    /**
     * Get finish hour
     *
     * @return [int] hour
     */
    public int getFinishHour() {
        return finishHour;
    }

    /**
     * Get finish minute
     *
     * @return [int] minute
     */
    public int getFinishMinute() {
        return finishMinute;
    }

    /**
     * Get option day
     *
     * @return [int] day
     */
    public int getDay() {
        return day;
    }
}