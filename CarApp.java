/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carapp;
import java.util.Scanner;

/**
 *
 * @author tung
 */
public class CarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String input; 
        Car car;
        while(true)
        {
          System.out.print("Enter car model(C, E, CS) or quit to exit: ");
          input = scanner.nextLine();
          
          if ("quit".equalsIgnoreCase(input))
          {
              break;
          }
          
          
          switch(input.toUpperCase())
          {
              case "C":
                  car = new model_C();
                  break;
              case "E":
                  car = new model_E();
                  break;
              case "CS":
                  car = new model_CS();
                  break;
              default:
                  System.out.println("Invalid input.");
                  continue;
              
          
          }
          
          System.out.print("Option (V-8, V-12, Sun Roof, Baupunkt New York 800 Radio (Radio), Spare Tire, Oversized Gas Tank(OGT), done): ");
          while(!(input = scanner.nextLine()).equalsIgnoreCase("done"))
          {
              System.out.print("Option (V-8, V-12, Sun Roof, Baupunkt New York 800 Radio (Radio), Spare Tire, Oversized Gas Tank(OGT), done): ");
              switch (input.toLowerCase())
              {
                  case "v-8":
                      car = new V8Engine(car);
                      break;
                  case "v-12":
                      car = new V12Engine(car);
                      break;              
                  case "sun roof":
                      car = new sunRoof(car);
                      break;
                  case "radio":
                      car  = new Radio(car);
                      break;
                  case "spare tire":
                      car = new spareTire(car);
                      break;
                  case "ogt":
                      car = new oversizedGasTank(car);
                      break;
                      
                  default:
                      System.out.println("Invalid Input");
                      continue;
                     
                   
              }
          }
          
          System.out.println("New Order:");
          System.out.printf("   %s%n",car.getInfo());
          System.out.printf("   Cost: $%,d%n", car.getCost());
          System.out.println ("End Order");
    
   
}
        
        scanner.close();
    
}
}
