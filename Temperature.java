
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature implements Display
{
    //The class to calculate  temperature
  public String displaytext(String text){
      //Display the formula
      text="The formula for temperature is C+273 or K-273"; 
    return text;
    
    }
    
  public double celsius(double kelvin){
      //Has the variables to solve for
    double k=kelvin;
    
    return k-273;
    }
    
  public double kelvin(double celsius){
       //Has the variables to solve for
    double c=celsius;
    
    return c+273;
    
    }  
}
