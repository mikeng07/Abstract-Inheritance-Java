/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public class V12Engine extends decorator {
    
    public V12Engine (Car decoratedCar)
    {
        super(decoratedCar);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost() + 6400;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + " ,V-12 Engine";
    }

    @Override
    public String getType() {
       return decoratedCar.getType();
    }
    
}

