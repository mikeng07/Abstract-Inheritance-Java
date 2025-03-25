/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public class Radio extends decorator {
    
    public Radio (Car decoratedCar)
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
        return super.getInfo() + " ,Blaupunkt New York 800 Radio";
    }

    @Override
    public String getType() {
       return decoratedCar.getType();
    }
    
}
