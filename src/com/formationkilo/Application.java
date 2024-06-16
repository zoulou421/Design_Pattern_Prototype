package com.formationkilo;

public class Application {
 public static void main(String[] args) throws CloneNotSupportedException {
	Figure f1=new Circle(new Point(10,10), new Point(20,20));
    Figure f2=new Rectangle(new Point(10,10), new Point(20,20));
    System.out.println("Surface of "+f1+"is :"+f1.surface());
    System.out.println("Surface of "+f2+"is :"+f2.surface());
    
    System.out.println("Copy of f1 :");
    Figure copyF1=f1.clone();
    System.out.println("Copy of f1 Surface of "+copyF1+"is :"+copyF1.surface());
    
    System.out.println("Copy of f2 :");
    Figure copyF2=f2.clone();
    System.out.println("Copy of f2 Surface of "+copyF2+"is :"+copyF2.surface());
  
    f1.p1.x=60;
    System.out.println(f1);
    System.out.println(copyF1);
 }
}
