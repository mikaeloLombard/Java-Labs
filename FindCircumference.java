
package mathexample;

import java.util.Scanner;

public class FindCircumference {

    
    public static void main(String[] args) 
    {   // Find circunference of a circle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        
        double circ = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.printf("Circunference: %f: Area: %f\n ", circ, area);
        
        
        
    }
    
}
