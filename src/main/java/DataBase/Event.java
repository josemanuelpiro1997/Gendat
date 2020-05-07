package DataBase;

import java.util.ArrayList;

public class Event {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private String eventName;
    private ArrayList<EventOpt> options;

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Event's class constructor
     *
     * @param eventName Event's name
     */
    public Event(String eventName) {
        this.eventName = eventName;
    }

    //PUBLIC METHODS
    //------------------------------------------------------------------------------------------------------------------

    /**
     * get event name
     *
     * @return [String] eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * get all options of this event
     *
     * @return [ArrayList<EventOpt>] options
     */
    public ArrayList<EventOpt> getOptions() {
        return options;
    }

    /**
     * get some option of this event
     *
     * @param index [int] option's index
     * @return [EventOpt] option
     */
    public EventOpt getOption(int index) {
        return this.options.get(index);
    }

    /**
     * add option for this event
     *
     * @param optionNum    [int] option number
     * @param startHour    [int] start hour of subject
     * @param startMinute  [int] start minute of subject
     * @param finishHour   [int] finish hour of subject
     * @param finishMinute [int] finish minute of subject
     * @param day          [int] day of subject
     */
    public void setOption(int optionNum, int startHour, int startMinute, int finishHour, int finishMinute, int day) {
        EventOpt newEventOpt = new EventOpt(optionNum, startHour, startMinute, finishHour, finishMinute, day);
        this.options.add(newEventOpt);
    }

}