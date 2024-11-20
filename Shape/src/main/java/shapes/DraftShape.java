/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Anh Huy
 */
public abstract class Shape {
    abstract public double circumstance();
    abstract public double area();
}
public Circle extends Shape {
    double r;
    double Circle (double rr) { r = rr;}
    public double circumstance(double r) {return 2* Math.PI*r;}
    public double area() {return Math.PI*r*r;}
}
class Rect extends Shape {
    double l, w;
    public Rect(double ll, double ww) {
    l = ll; w = ww;
}
    public double circumstance() {return 2*(l+w);}
    public double area() {return l*w;}
}
public class DraftShape {
    
}
