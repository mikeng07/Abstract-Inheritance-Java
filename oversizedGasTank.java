/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public  class oversizedGasTank extends decorator {
    
    public oversizedGasTank (Car decoratedCar)
    {
        super(decoratedCar);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost() + 940;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + " ,Oversized Gas Tank";
    }

    @Override
    public String getType() {
       return decoratedCar.getType();
    }
    
}
