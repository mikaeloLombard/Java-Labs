
package areaofatriangle;

import java.util.Scanner;

public class AreaOfATriangle 
{

    public static void main(String[] args) 
    {     //The area of a triangle is (base * height) /2
        Scanner input = new Scanner(System.in);
               
        System.out.println(" Welcome to the Interactive Triangle Area Calculator!");
        System.out.println(" ");
        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();
        System.out.print("Enter the height: ");
        int height = input.nextInt();
                
        
        int fr = base * height;
        double sr = (double)fr / 2;
        System.out.print("The area is:  ");
        
        System.out.println(sr);
                
	

    }
}
