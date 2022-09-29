import MyJavaPackage.MyConversion.conversion;
//package MyJavaPackage.MyPrograms;
public class programs {
    public static void main(String[] args) {
        System.out.println("Inch to cm: " + conversion.inchToCm(1));
        System.out.println("Cm to inch: " + conversion.cmToInch(1));
        System.out.println("Pound to kg: " + conversion.poundToKg(1));
        System.out.println("Kg to pound: " + conversion.kgToPound(1));
        System.out.println("Mile to km: " + conversion.mileToKm(1));
        System.out.println("Km to mile: " + conversion.kmToMile(1));
        System.out.println("Minute to hour: " + conversion.minuteToHour(1));
        System.out.println("Hour to minute: " + conversion.hourToMinute(1));
        System.out.println("Celsius to fahrenheit: " + conversion.celsiusToFahrenheit(1));
        System.out.println("Fahrenheit to celsius: " + conversion.fahrenheitToCelsius(1));
    }
}