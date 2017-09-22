
package calculatearea;

import java.util.Scanner;
public class CreatingModules 
{

    
    public static void main(String[] args) 
    {
        getInfo();
        CalculateAreaRectangle();
        CalculateAreaTriangle();

       
       
       
        

    }
    public static void getInfo()
    {
       System.out.print("Mikaelo");
       System.out.print(" ");
       System.out.println("Lombard");
       System.out.println("9-20-2017");
       System.out.print("This program will calculate");
       System.out.print(" ");
       System.out.println("the area of a rectangle and a triangle.");
        
       
        
        
      
        
    }
    public static void CalculateAreaRectangle()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the height of the rectangle: ");
       double height = keyboard.nextDouble();
       System.out.print("Enter the width of the rectangle: ");
       double width = keyboard.nextDouble();
       double area = height * width * 2;
       System.out.print("The area of a rectangle is: "); 
       System.out.println(area);
    }
    
    public static void CalculateAreaTriangle()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the base of a triangle: ");
       double base = keyboard.nextDouble();
       //System.out.println(base);
       System.out.print("Enter the height of a triangle: ");
       double height = keyboard.nextDouble();
       //System.out.println(height);
       double area = .5 * base * height;
       //System.out.println(area);
       System.out.print("The area of the triangle is: ");
       System.out.println(area);
       
    }
}
