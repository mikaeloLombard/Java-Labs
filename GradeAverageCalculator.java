
package gradeaveragecalculator;

import java.util.Scanner;

public class GradeAverageCalculator {

   
    public static void main(String[] args)
    {
        
        System.out.println("Welcome to Avarage Grade Calculator.\n");
        double total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many grades? ");
        double numgrades = keyboard.nextInt();
        
        
        for(double i=0; i<numgrades; i++)
        { 
            
            Scanner keyboard2 = new Scanner(System.in);
            System.out.print("Enter a grade: ");
            
            double grade = keyboard2.nextInt();
            
            total += grade;
            System.out.println(total);
            
            
        }
        System.out.println("Total = " + total);
        
        System.out.println("Average = " + total / numgrades);    
        double average = total / numgrades;
        char grade1;
        double A = 90;
        double B = 80;
        double C = 70;
        double D = 60;
        
                
        if (average >= A) {
           grade1 = 'A';
        } else if (average >= B) {
           grade1 = 'B';
        } else if (average >= C) {
           grade1 = 'C';
        } else if (average >= D) {
           grade1 = 'D';
        } else {
           grade1 = 'F';
        }
        System.out.println("Grade = " + grade1);
                
        
        
        
        
        
        
        
        
    }
    
}
