
package understandingtypecasting;


public class UnderstandingTypeCasting 
{    
    
 
    public static void main(String[] args) 
    {       // 20/15 == 1.3333333
    int x = 20;
    int y = 15;
    int i = x/y;   // int / int ==> ??
    double d1 = x/y;   // int/int ==> int ==> double
    double d2 = x / (1.0 * y); // int/ (double * int) ==> double
    double d3 = (double)x / y;  // int / double ==> double
    double d4 = x / (double) y; // int / double ==> double
    
    System.out.println(i);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    
    // another point
    
    //int w = 3.14;
    //double w = 3.14; 
    }
    
}
