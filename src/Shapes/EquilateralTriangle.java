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
public class EquilateralTriangle extends Container{
    double oneSideLenght;

    public EquilateralTriangle(double oneSideLenght) {
        this.oneSideLenght = oneSideLenght;
    }

    public double getOneSideLenght() {
        return oneSideLenght;
    }

    public void setOneSideLenght(double oneSideLenght) {
        this.oneSideLenght = oneSideLenght;
    }
    
    @Override
    public double area()
    {
        return (Math.sqrt(3)/4)*(oneSideLenght*oneSideLenght);
    }   
    
    @Override
    public double parameter()
    {
        return  3*oneSideLenght;
    }     
    
}
