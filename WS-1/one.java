/* 
 * Write a unit conversion program using the conversion factors of Table 1.  
 * Ask the users from which unit they want to convert 
 * (fl.oz, gal, oz, lb, in, ft, mi) and which unit they want to convert to 
 * (ml, l, g, kg, mm, cm, m,km). 
 * Reject incompatible conversions (such as gal to km). 
 * Ask for the value to be converted, then display the result
 */
import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to be converted");
        double value = input.nextDouble();
        System.out.println("Enter the unit to be converted");
        String unit = input.next();
        System.out.println("Enter the unit to be converted to");
        String unitTo = input.next();
        double result = 0;
        if(unit.equals("fl.oz") && unitTo.equals("ml")) {
            result = value * 29.5735;
        }
        else if(unit.equals("gal") && unitTo.equals("l")) {
            result = value * 0.0378541;
        }
        else if(unit.equals("ounze") && unitTo.equals("ml")) {
            result = value * 28.3495;
        }
        else if(unit.equals("lb") && unitTo.equals("kg")) {
            result = value * 0.4535924;
        }
        else if(unit.equals("in") && unitTo.equals("cm")) {
            result = value * 2.54;
        }
        else if(unit.equals("ft") && unitTo.equals("m")) {
            result = value * 0.3048;
        }
        else if(unit.equals("mi") && unitTo.equals("km")) {
            result = value * 1.60934;
        }
        else{
            System.out.println("Incompatible conversion");
        }
        System.out.println("The result is " + result);
    }
}
