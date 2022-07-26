/*
 * Write a program in Java with class Triangle with the data fields width, length, area and colour. The length, width and area are of double type and colour is of string type .
 The class should include the below listed constructors  and methods
 Triangle()
Triangle (int x, int y, int z)
Triangle(Triangle  temp)
 set_ length () , set_width (), set_ colour(), and find_ area () 

Boolean isTriangle()    -  This method will return true or false, depending on whether the values in the three sides make up a valid triangle.  Given that a, b, and c are in sorted order (the specific constructor only accepts them in sorted order), the sides represent a valid  triangle only if a + b > c.
boolean isRight()  -  This method returns true or false, depending on whether the triangle is a right triangle or not.  Specifically, it will return true if the sides form a valid triangle (via a call to the isTriangle() method  AND the sides full fill the formula a2+b2=c2
boolean isIsosceles()   -   This method returns true or false, depending on whether the triangle is a isosceles triangle or not.  Specifically, it will return true if the sides form a valid triangle AND two of the sides are equal (it can be any two).  
boolean isScalene()   -  This method returns true or false, depending on whether the triangle is a scalene triangle or not.  Specifically, it will return true if the sides form a valid triangle AND none of the sides are equal to each other.
boolean isEquilateral()   -   This method returns true or false, depending on whether the triangle is a equilateral triangle or not.  Specifically, it will return true if the sides form a valid triangle AND all the sides are of equal length.
boolean match_Rect(Triangle t) - Create two object of Triangle and compare their area and colour. If area and color both are the same for the objects then display “Matching Triangles”, otherwise display “Non matching Triangle”.

 */
import java.util.Scanner;
import java.lang.Math;
class Triangle{
    private double length;
    private double width;
    private double area;
    private String colour;
    private int x;
    private int y;
    private int z;

    public Triangle(){
        length = 0;
        width = 0;
        area = 0;
        colour = "";
    }
    public Triangle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Triangle(Triangle temp){
        this.length = temp.length;
        this.width = temp.width;
        this.area = temp.area;
        this.colour = temp.colour;
    }
    public void set_length(int x){
        this.length = x;
    }
    public void set_width(int y){
        this.width = y;
    }
    public void set_colour(String colour){
        this.colour = colour;
    }
    public double find_area(){
        area = (length*width)/2;
        return area;
    }
    public boolean isTriangle(){
        if(x+y>z){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isRight(){
        if(isTriangle() && (Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2))){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isIsosceles(){
        if(isTriangle() && (x==y || x==z || y==z)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isScalene(){
        if(isTriangle() && (x!=y && x!=z && y!=z)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEquilateral(){
        if(isTriangle() && (x==y && x==z && y==z)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean match_Rect(Triangle t){
        if(this.area==t.area && this.colour==t.colour){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * six
 */
public class six {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the triangle");
        int length = scan.nextInt();
        System.out.println("Enter the width of the triangle");
        int width = scan.nextInt();
        System.out.println("Enter the colour of the triangle");
        String colour = scan.next();
        Triangle t = new Triangle();
        t.set_length(length);
        t.set_width(width);
        t.set_colour(colour);
        System.out.println("The area of the triangle is "+t.find_area());
        System.out.println("Is the triangle a triangle? "+t.isTriangle());
        System.out.println("Is the triangle a right triangle? "+t.isRight());
        System.out.println("Is the triangle a isosceles triangle? "+t.isIsosceles());
        System.out.println("Is the triangle a scalene triangle? "+t.isScalene());
        System.out.println("Is the triangle a equilateral triangle? "+t.isEquilateral());
        System.out.println("Enter the length of the triangle");
        int length1 = scan.nextInt();
        System.out.println("Enter the width of the triangle");
        int width1 = scan.nextInt();
        System.out.println("Enter the colour of the triangle");
        String colour1 = scan.next();
        Triangle t1 = new Triangle();
        t1.set_length(length1);
        t1.set_width(width1);
        t1.set_colour(colour1);
        System.out.println("Is the triangle a match? "+t.match_Rect(t1));

    }
}