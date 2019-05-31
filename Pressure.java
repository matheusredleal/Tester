
/**
 * Write a description of class Pressure here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pressure
{
  public double pastoatm(double pascal){
    double p=pascal;
    return p/101.325;
    }
   public double atmtopas(double atm){
    double a=atm;
    return a*101.325;
  }
  public double atmtommHg(double atm){
    double a=atm;
    return a*760;
    }
  public double mmHgtoatm(double Hg){
    double h=Hg;
    return h/760;
  }  
}
