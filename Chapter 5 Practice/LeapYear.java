

/**
 * Write a description of class LeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    /** description of instance variable x (add comment for each instance variable) */
    private int year;

    /**
     * Default constructor for objects of class LeapYear
     */
    public LeapYear( int year )
    {
        // initialise instance variables
        this.year = year;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void isLeapYear ()
    {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("This is a leap year.");
        }
        else
        {
            System.out.println("This is not a leap year.");
        }
    }

}
