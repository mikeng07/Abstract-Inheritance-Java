/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carapp;

/**
 *
 * @author tung
 */
public class model_E implements Car{
    @Override
    public int getCost() {return 45000;}
    @Override
    public String getInfo (){return "Car: Model E with";}
    @Override
    public String getType(){return "E";}
    
}
