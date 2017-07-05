/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author sahil
 */
public class Circle extends Container{
    double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area()
    {
        return  3.14*(radius*radius);
    }   
    
    @Override
    public double parameter()
    {
        return  2*3.14*(radius);
    }  
}
