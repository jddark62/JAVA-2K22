/*
 * Implement a class Employee. 
 * An employee has a name (a string) and a salary (a double). 
 * Write a default constructor, 
 * a constructor with two parameters (name and salary), and 
 * methods to return the name and salary. 
 * Write a small program that tests your class.
 */

 /**
  * one
  */
 
 class EmployeeDetails{
   String emp_name;
   double salary;
   
   //default constructor 
   EmployeeDetails(String name, double salary){

      this.emp_name = name;
      this.salary = salary;

   }

   // method to return name
   String getName ()
   {
      return emp_name;
   }

   //method to return salary 
   double getSalary ()
   {
      return salary;
   }

   void display_details(){
      System.out.println("Name: "+ emp_name +" Salary: "+ salary);
   }
 }

 /**
  * one
  */
 public class one {
 
   public static void main(String[] args) {
      
      EmployeeDetails e1 = new EmployeeDetails("Employee 1", 900000);
      EmployeeDetails e2 = new EmployeeDetails("Employee 2", 1000000);
      e1.display_details();
      e2.display_details();
   }
 }