/**
 * Exception to be thrown when variable temperature is greater then to static TOO_HOT. 
 *
 * @author Kian R Frawley
 * @version 10/25/21
 */
public class TooHotException extends Exception 
{
    /**
     * Constructor used to pass a hard coded message to superclass Exception.
     * 
     */
    public TooHotException()
    {
        this("Your coffee is too hot!");
    }   
    /**
     * Constructor used to take a single parameter and then send that to its super.
     * 
     * @param message A String that will be passed to a superclass constructor.
     */
    public TooHotException(String message)
    {
        super(message);
    }
}