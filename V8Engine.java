/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public class V8Engine extends decorator {
    
    public V8Engine (Car decoratedCar)
    {
        super(decoratedCar);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost() + 4400;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + " V-8 Engine";
    }

    @Override
    public String getType() {
        return decoratedCar.getType();
    }
    
    
}
