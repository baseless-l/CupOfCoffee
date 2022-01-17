
/**
 * Exception to be thrown when variable temperature is less then static TOO_COLD. 
 *
 * @author Kian R Frawley
 * @version 10/25/21
 */
public class TooColdException extends Exception 
{
    /**
     * Constructor used to pass a hard coded message to superclass Exception.
     * 
     */
    public TooColdException()
    {
        this("Your coffee is too cold!");
    }   
    /**
     * Constructor used to take a single parameter and then send that to its super.
     * 
     * @param message A String that will be passed to a superclass constructor.
     */
    public TooColdException(String message)
    {
        super(message);
    }
}
