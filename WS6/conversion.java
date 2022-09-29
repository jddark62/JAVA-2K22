/*
 * Develop a Class named CONVERSION  which includes  Methods  to   perform  the following tasks stored inside of MyJavaPackage.MyConversion  
To convert  inches to centimeters    I Inch = 2.54 Cm
Convert centimeters to inches.
There are 454 grams in a pound and 1000 grams in a kilogram. Write a method to convert pounds to kilograms and kilograms to pounds
Conversion from miles to kilometers   I Mile = 1.609344 Km.
Converting  minutes to hours, minutes and seconds
Fahrenheit to Celsius and Celsius to Fahrenheit  1 Celsius = 33.8  Fahrenheit.
Write an interactive  Test program to perform the above conversions. Store your code in a package named MyJavaPackage .MyPrograms.

 */

package MyJavapackage.MyConversion;

class conversion {
    public static void main(String[] args) {
        
    }
    public static double inchToCm(double inch) {
        return inch * 2.54;
    }
    public static double cmToInch(double cm) {
        return cm / 2.54;
    }
    public static double poundToKg(double pound) {
        return pound * 0.45359237;
    }
    public static double kgToPound(double kg) {
        return kg / 0.45359237;
    }
    public static double mileToKm(double mile) {
        return mile * 1.609344;
    }
    public static double kmToMile(double km) {
        return km / 1.609344;
    }
    public static double minuteToHour(double minute) {
        return minute / 60;
    }
    public static double hourToMinute(double hour) {
        return hour * 60;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 33.8;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return fahrenheit / 33.8;
    }
}