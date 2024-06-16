package com.formationkilo;

public abstract class Figure implements Cloneable{
   protected Point p1;
   protected Point p2;
   public Figure(Point p1, Point p2) {
	this.p1 = p1;
	this.p2 = p2;
   }
   
   @Override
	public Figure clone() throws CloneNotSupportedException {
	   //Point px=p1.clone();
	   //Point py=p2.clone();
	   Figure f=(Figure) super.clone();
	   f.p1=p1.clone();//f.p1=px; SECOND OPTION
	   f.p2=p2.clone();//f.p2=py; SECOND OPTION
		return f;
	}
   public abstract double surface();
   @Override
	public String toString() {
		return "p1="+p1+",p2="+p2;
	}
}
