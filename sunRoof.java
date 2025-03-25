/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public  class sunRoof extends decorator {
    
    public sunRoof (Car decoratedCar)
    {
        super(decoratedCar);
    }
    
    @Override
    public int getCost()
    {
        return switch (decoratedCar.getType()) {
            case "C" -> super.getCost() + 1940;
            case "E" -> super.getCost() + 2240;
            case "CS" -> super.getCost() + 3400;
            default -> super.getCost();
        };

    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + " ,Sun Roof";
    }

    @Override
    public String getType() {
        return decoratedCar.getType();
    }
    
}