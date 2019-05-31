
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Scanner;
public class Main
{
    //The main method where we call the methods of other classes
    public static void main(){
        //Inicializing variables
        Idealgas p=new Idealgas();
        Temperature t=new Temperature();
        String par="y";
        Scanner track= new Scanner(System.in);
        int equ;
        int choice;
        double val1;
        double val2;
        double val3;
        ArrayList<String> list=new ArrayList<String>();
        //A while loop to run as long as the user want
        double x = 0;
        
        while(par.equals("y")){
            //Ask the user to input what they want to do
            System.out.println("For ideal gas law press 1");
            System.out.println("For celcuis to Kelvin press 2");
            System.out.println("To display your history press 3");
            equ=track.nextInt();
            System.out.println();
            if(equ==1){
                //Displays the formula and ask for what to solve for
                System.out.println(p.displaytext(""));
                System.out.println("to solve for pressure press 1");
                System.out.println("to solve for volume press 2");
                System.out.println("to solve for moles press 3");
                choice=track.nextInt();
                System.out.println();
                if (choice==1){
                    //If statements to input the variables
                    System.out.println("Input the volume in liters");
                    val2=track.nextDouble();
                    System.out.println("Input number of moles");
                    val1=track.nextDouble();
                    System.out.println("Input the temperature in kelvin");
                    val3=track.nextDouble();
                    x = (p.pressure(val2,val1,val3));
                    System.out.println("the pressure is " + x );
                    list.add("P= "+x +" atm");
                    System.out.println();
                }
                else if (choice==2){
                    System.out.println("Input the pressure in atm");
                    val2=track.nextDouble();
                    System.out.println("Input number of moles");
                    val1=track.nextDouble();
                    System.out.println("Input the temperature in kelvin");
                    val3=track.nextDouble();
                    x = (p.volume(val2,val1,val3));
                    System.out.println("the volume is " + x );
                    list.add("V= "+x +" L");
                    System.out.println();
                }
                else if (choice==3){
                    
                    System.out.println("Input the pressure in atm");
                    val2=track.nextDouble();
                    System.out.println("Input the volume in liters");
                    val1=track.nextDouble();
                    System.out.println("Input the temperature in kelvin");
                    val3=track.nextDouble();
                    x = (p.moles(val2,val1,val3));
                    System.out.println("the moles equal " + x);
                    list.add("M= "+x);
                    System.out.println();
                }
 
                
            }
            else if(equ==2){
                //Displays the formula and ask for what to solve for
                System.out.println(t.displaytext(""));
                System.out.println("to solve for celsius press 1");
                System.out.println("to solve for kelvin press 2");
                choice=track.nextInt();
                System.out.println();
                if(choice==1){
                    //If statements to input the variable
                    System.out.println("Input the temperature in kelvin");
                    val1=track.nextDouble();
                    x = (t.celsius(val1)); 
                    System.out.println("the celcius equal " + x);
                    list.add("C=" + x);
                    System.out.println();
                }
                else if(choice==2){
                     System.out.println("Input the temperature in celsius");
                     val1=track.nextDouble();
                     x = (t.kelvin(val1));
                     System.out.println("the kelvin equal " + x);
                     list.add("K=" + x);
                     System.out.println();
                }
            }
            //Where it displays the values that were displayed.
            else if(equ==3){    
              if(list.size()==0){
                System.out.println("You don't have anything iputed yet");
                
                }
              else{   
                 System.out.println(list.toString());
               }
            }
            choice=0;
            System.out.println("To continue press y to stop press n");
            par=track.next();
            System.out.println();
        }
     }
        
    
    
}
