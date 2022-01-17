import java.util.InputMismatchException;
/**
 * Class CupOfCoffee will be used to intialize all required data fields 
 * and arrays, those being coffeeType,ounces,temperature, TOO_COLD, TOO_HOT, and validCoffieeTypes[]. 
 * It will have the option for the user to be prompted to select a desired coffee type
 * from a list which then will accept input to be validated using set methods 
 * and programmer defined exceptions to ensre input falls within acceptable parameters.
 * 
 * @author Kian R Frawley
 * 
 * @version 10/25/21
 */
public class CupOfCoffee
{
  // Declared Instance variables 
  private String coffeeType;
  private int ounces;
  private int temperature;
  public static int TOO_COLD = 150;
  public static int TOO_HOT = 185;
  
  public static String[] validCoffeeTypes = {"Regular","Decaf","Latte"
                                                ,"Espresso","Cappuccino"};
  
  /**
   * No-arg constructor for CupOfCoffee.
   * 
   * @throws TooColdException If temp is less then 150.
   * @throws TooHotException If temp is greater then 185.
   * @throws NotPositiveNumberException if ounces is less then or equal to 0.
   * @throws ArrayIndexOutOfBoundsException if the selected coffee type does not exist.
   */
  public CupOfCoffee() throws ArrayIndexOutOfBoundsException, NotPositiveNumberException,TooColdException,TooHotException
  {
      this(0,10,150);
  }
  /**
   * Constructor for class CupOfCoffee, this will pass data fields to 
   * set methods for validation.
   * 
   * @param coffeeType The user selected int that correlates to one of the string coffee types.          
   * @param ounces Selected ounces of Coffee.
   * @param temperature Selected temperature for Coffee.
   * 
   * @throws TooColdException If temp is less then 150.
   * @throws TooHotException If temp is greater then 185.
   * @throws NotPositiveNumberException if ounces is less then or equal to 0.
   * @throws ArrayIndexOutOfBoundsException if the selected coffee type does not exist.
   */
  public CupOfCoffee(int coffeeType,int ounces,int temperature) throws ArrayIndexOutOfBoundsException, NotPositiveNumberException,TooHotException,TooColdException
  {
    setCoffeeType(coffeeType);
    setOunces(ounces);
    setTemperature(temperature);
  }
  /**
   * Set method for data field coffeeType that takes a int as an argument
   * and sets a string. 
   * 
   * @param coffeeType The user selected int that correlates to one of the string coffee types.
   * 
   * @throws ArrayIndexOutOfBoundsException if the selected coffee type does not exist.
   */
   public void setCoffeeType(int coffeeType) throws ArrayIndexOutOfBoundsException
   {
       this.coffeeType = validCoffeeTypes[coffeeType];
   }
   /**
    * Set method for data field ounces. Validates the data field 
    * is a positive number.
    * 
    * @param ounces Selected ounces of Coffee.
    * 
    * @throws NotPositiveNumberException if passed an int less or equal to zero.
    */
   public void setOunces(int ounces) throws NotPositiveNumberException
   {
       if(ounces > 0)
       {
           this.ounces = ounces; } 
      else {
            throw new NotPositiveNumberException(); 
      }
   }
   /**
    * Set method for data field temperature. Validates that temperature
    * falls between an acceptable interval by compairng the temperature 
    * to static data fields TOO_COLD and TOO_HOT. Will throw an exception 
    * if this test is failed.
    * 
    * @param temperature Selected temperature for coffee.
    * 
    * @throws TooColdException If temp is less then 150.
    * @throws TooHotException If temp is greater then 185.
    */
    public void setTemperature(int temperature) throws TooColdException,TooHotException
    {
        if(temperature < TOO_COLD)
        {
           throw new TooColdException();
        }
        if(temperature > TOO_HOT)
        {
           throw new TooHotException();
        }
        else
        {
            this.temperature = temperature;
        }
    }
    /**
    * Get method for data field coffeeType.
    * 
    * @return Type of coffee.
    */
    public String getCoffeeType()
    {
      return this.coffeeType;  
    }
    /**
    * Get method for data field ounces.
    * 
    * @return Selected ounces of Coffee.
    */
    public int getOunces()
    {
      return this.ounces;  
    }
    /**
    * Get method for data field temperature.
    * 
    * @return Selected temperature for Coffee.
    */
    public int getTemperature()
    {
      return this.temperature;  
    }
    /**
     * Static get method for elements of array validCoffeeTypes.
     * Returns a numbered list of each element to assist users in selecting
     * their coffee.
     * 
     * @return Numbered menu containing different kinds of coffee.
     */
     public static String getValidCoffeeTypes()
     {
         StringBuilder output = new StringBuilder();

         output.append("Select Desired Coffee Type");
         output.append("\n");
         output.append("\n");
         for (int i = 0; i < validCoffeeTypes.length; i++)
         {
             output.append(i);
             output.append("- ");
             output.append(validCoffeeTypes[i]);
             output.append("\n");
         }
         output.append("\n");
         
         return output.toString();
     }
     /**
     * toString method for a CupOfCoffee object, returns descriptive information
     * reguarding CupOfCoffee. 
     * 
     * @return string that contains coffeeType,ounces, and temperature.
     */
     @Override 
     public String toString()
     {
         StringBuilder output = new StringBuilder();
         output.append("Coffee Type: ");
         output.append(getCoffeeType());
         output.append("\n");
         output.append("Ounces of Coffee: ");
         output.append(getOunces());
         output.append("\n");
         output.append("Temperature of Coffee: ");
         output.append(getTemperature());
         output.append(" Degrees");
    
         return output.toString();
     }
}
