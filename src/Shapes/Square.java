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
public class Square extends Container{
    double width, heigth;

    public Square(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    @Override
    public double area()
    {
        return  heigth*width;
    }   
    
    @Override
    public double parameter()
    {
        return  2*(heigth+width);
    }   
}
