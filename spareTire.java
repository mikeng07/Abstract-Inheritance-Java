/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public  class spareTire extends decorator {
    
    public spareTire (Car decoratedCar)
    {
        super(decoratedCar);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost() + 440;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + " ,Spare Tire";
    }

    @Override
    public String getType() {
       return decoratedCar.getType();
    }
    
}
