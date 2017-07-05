/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Shapes.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sahil
 */
public class Tester {
    
    public static void main(String[] args) throws Exception{
            
    ArrayList<Container> myList = new ArrayList();
    Scanner read  = new Scanner(System.in);
    
    double r ;
    double h ;
    double w ;
    double s ;
    System.out.println("++++++++++++++++++ Circle +++++++++++++++");
    System.out.println("radius of circle: ");
    r = new Scanner(System.in).nextDouble();
    
    myList.add(new Circle(r));

    System.out.println("Area of circle is:  "  + myList.get(0).area());
    System.out.println("Parameter of circle is:  "  + myList.get(0).parameter() + "\n");

    
    System.out.println("++++++++++++++++++ EquilateralTriangle +++++++++++++++");
    System.out.println("side of EquilateralTriangle: ");
    s = new Scanner(System.in).nextDouble();

    myList.add(new EquilateralTriangle(s));

    System.out.println("Area of EquilateralTriangle is:  "  + myList.get(1).area());
    System.out.println("Parameter of EquilateralTriangle is:  "  + myList.get(1).parameter() + "\n");  
    
    System.out.println("++++++++++++++++++ Square +++++++++++++++");
    System.out.println("heigth of square: ");
    h = new Scanner(System.in).nextDouble();
    System.out.println("width of square: ");
    w = new Scanner(System.in).nextDouble();
    
    myList.add(new Square(h,w));

    System.out.println("Area of Square is:  "  + myList.get(2).area());
    System.out.println("Parameter of Square is:  "  + myList.get(2).parameter() + "\n");
    
    
    if(myList.get(0).area() > myList.get(1).area() && myList.get(0).area() > myList.get(2).area()){
        System.out.println("maximum area is of circle: "  + myList.get(0).area());
    }
    else if(myList.get(1).area() > myList.get(2).area() && myList.get(1).area() > myList.get(0).area()){
        System.out.println("maximum area is of EquilateralTriangle: "  + myList.get(1).area());
    }
    else{
        System.out.println("maximum area is of square: "  + myList.get(2).area());
    }
    
    
    
    if(myList.get(0).parameter() > myList.get(1).parameter() && myList.get(0).parameter() > myList.get(2).parameter()){
        System.out.println("maximum area is of circle: "  + myList.get(0).parameter());
    }
    else if(myList.get(1).parameter() > myList.get(2).parameter() && myList.get(1).parameter() > myList.get(0).parameter()){
        System.out.println("maximum area is of EquilateralTriangle: "  + myList.get(1).parameter());
    }
    else{
        System.out.println("maximum area is of square: "  + myList.get(2).parameter());
    }
}  
}
