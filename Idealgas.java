
/**
 * Write a description of class Gaslaw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Idealgas implements Display
{
    //The class to calculate ideal gas
   public String displaytext(String text){
       //Display the formula
      text="The formula for ideal gas law is P*V/nRT"; 
    return text;
    
    }
   public double pressure(double volume,double moles,double temperature){
    //Has the variables to solve for
    double v=volume;
    double m=moles;
    double t=temperature;
    double r=0.08206;
    
    
    return(m*t*r)/v;
    } 
   public double volume(double pressure,double moles,double temperature){
        //Has the variables to solve for
    double p=pressure;
    double m=moles;
    double t=temperature;
    double r=0.08206;
    
    
    return(m*t*r)/p;
    } 
   public double moles(double pressure,double volume,double temperature){
      //Has the variables to solve for
    double p=pressure;
    double v=volume;
    double t=temperature;
    double r=0.08206;
    
    
    return p*v/(r*t);
    } 
   
}
