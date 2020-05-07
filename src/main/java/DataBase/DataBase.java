package DataBase;

import java.util.ArrayList;

public class DataBase {
    //PRIVATE VARIABLES
    //------------------------------------------------------------------------------------------------------------------
    private ArrayList<User> users;
    private String DBname;

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------

    /**
     * constructor of DataBase class.
     *
     * @param DBname [String] Name of DataBase
     */
    public DataBase(String DBname) {
        this.DBname = DBname;
    }

    //PUBLIC METHODS
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Add user to the DataBase
     *
     * @param newUser [User] User to add
     */
    public void addUser(User newUser) {
        this.users.add(newUser);
    }

    /**
     * gets the user by his name
     *
     * @param userName [String] name reference
     * @return [User] User element
     */
    public User getUser(String userName) throws IllegalAccessException {
        for (User user : this.users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        throw new IllegalAccessException("userName invalid");
    }
}