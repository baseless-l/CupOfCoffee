
/**
 * Exception to be thrown if variable onces is detected to be less then zero.
 * 
 * @author Kian R Frawley
 * @version 11/8/21
 */
public class NotPositiveNumberException extends Exception 
{
    /**
     * Constructor used to pass hardcoded message to Exception.
    */
    public NotPositiveNumberException()
    {
      this("You must request atleast one ounce of coffee!");
    }
    /**
     * Constructor used to take a single parameter and pass that to Exception
     * 
     */
    public NotPositiveNumberException(String message)
    {
        super(message);
    }
}
