/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public class model_CS implements Car {
    @Override
    public int getCost() {return 60000;}
    @Override
    public String getInfo (){return "Car: Model CS with";}
    @Override
    public String getType(){return "CS";}
    
}
