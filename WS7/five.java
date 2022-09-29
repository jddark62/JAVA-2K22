/*
 * This application calculates the charges for a stay at a hotel 
 * based on the arrival and departure dates.
The application begins by prompting the user for the month,
 day, and year of the arrival and the departure.
Next, the application displays the arrival date, 
the departure date, the room rate, the total price, 
and the number of nights.
The main method should  handle NumberFormatException 
if an invalid data for month, day, and year is entered.
Create three custom exception handlers named MonthOutOfRangeException, 
DayOutOfRangeException, and YearOutOfRangeException, 
respectively to handle such exceptions, 
in addition to NumberFormatException described above. 
Use the GregorianCalendar class to create dates from the int values 
entered by the user. 
Then, use the getTime method to convert the GregorianCalendar object 
to a Date object.

 */
import java.util.Scanner;
import java.util.GregorianCalendar;


