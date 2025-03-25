/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public abstract class decorator implements Car {
    
    protected Car decoratedCar;
    public decorator (Car decoratedCar)
    {
        this.decoratedCar = decoratedCar;
    }
   @Override 
    public int getCost()
    {
        return decoratedCar.getCost();
    }
    @Override
    public String getInfo() 
    {
        return decoratedCar.getInfo();
        
    }
    
    
}
