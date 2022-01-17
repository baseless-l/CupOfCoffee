import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * Driver for class CupOfCoffee will prompt the user to define all three 
 * data fields for an instance of CupOfCoffee object while catching any errors.
 * Then output information about the users coffee if no error is detected. 
 *
 * @author Kian R Frawley
 * 
 * @version 10/25/21
 */
public class driver
{
 public static void main(String[] args)
  {
    try 
    {

      
     int CoffeeType = Integer.parseInt(JOptionPane.showInputDialog(CupOfCoffee.getValidCoffeeTypes()));
     int Ounces = Integer.parseInt(JOptionPane.showInputDialog("Enter Ounces Of Coffee."));  
     int Temperature = Integer.parseInt(JOptionPane.showInputDialog("Enter Desired Coffee Temperature."));
      
     CupOfCoffee cup1 = new CupOfCoffee(CoffeeType,Ounces,Temperature);
     
     JOptionPane.showMessageDialog(null,cup1);
    }
    
    catch (InputMismatchException ex)
    {
      JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (ArrayIndexOutOfBoundsException ex)
    {
      JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (TooColdException ex)
    {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (TooHotException ex)
    {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (NotPositiveNumberException ex)
    {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    finally 
    {
     JOptionPane.showMessageDialog(null,"Have a Great Day!");  
    }
  }
}
