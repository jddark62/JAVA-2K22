/*
 * Define an abstract class named PassengerTicket that holds information 
 * related to any type of ticket. It must have the properties listed
 *  in the table below. 
 * Note that the departure and issue date time must be in the form of 
 * “yyyy/mm/dd HH:mm:ss”.
 *      Property         Type 
 *      seatNo           int
 *      seatAvailable    boolean
 *      seatStatus       String
 *      passengerName    String
 *      passengerGender  String
*       departure        String
*       departureDateTime    String
*       issueDateTime    String
*       totalPrice       double
* Define the all appropriate accessor and mutator methods related
 to the properties. 
 Also add a default constructor that initializes the all properties 
 to unknown but dateTime properties to “yyyy/mm/dd HH:mm:ss” 
 and total price and seatNo to zero. Set seatAvailable as true.
Total price varies among various types of tickets. 
So you are supposed to make setTotalPrice method as an abstract method.
 Also add toString method to get information about the ticket.
B). Now define a class named BusTicket that is derived 
from the PassengerTicket class. 
It has some additional properties shown in 
Figure: Add a no-argument constructor that initializes both distance 
and serviceCharge to 2.5 . 
* Property              Type
  distance              int
  serviceCharge         double
Add a constructor that takes distance and service charge as arguments and set them to the appropriate instance variables. Override the setTotalPrice method as follows: Calculate total price as distance*0.08 + service charge. Invoke the setTotalPrice method at the end of each constructor.

 */

abstract class PassengerTicket{
    int seatNo;
    boolean seatAvailable;
    String seatStatus;
    String passengerName;
    String passengerGender;
    String departure;
    String departureDateTime;
    String issueDateTime;
    double totalPrice;
    abstract double setTotalPrice();
    public string toString(){
        return "Seat No: " + seatNo + "\nSeat Available: " + seatAvailable + "\nSeat Status: " + seatStatus + "\nPassenger Name: " + passengerName + 
        "\nPassenger Gender: " + passengerGender + "\nDeparture: " + departure + "\nDeparture Date Time: " + departureDateTime + "\nIssue Date Time: " + issueDateTime + "\nTotal Price: " + totalPrice;
    }

    public void set {

      
    }
    
}


