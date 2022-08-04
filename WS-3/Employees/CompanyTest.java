/*
 * The task is to write a program for handling the employees of a company. The underlying Task is to support run time polymorphism using  inheritance , overriding methods. Hint : SUPER keyword is expected in constructor and methods. Use an array of objects for clerks and directors.
Class Employee
The main class is Employee. 
An employee has the following instance variables: 
age: an integer 
salary: an integer 
On employees the following methods work: 
Employee: sets all parameters 
increaseSalary: multiplies the salary by (1 + salaryIncrease) 
checkRetirement: returns true if age exceeds 65, otherwise false 
paySalary(int i): prints that company pays salary to employee i 
display: lists all variables on a single line 
Class Clerk
Clerk is a derived class from Employee. 
A clerk has one extra instance variable: 
illDays: an integer counting the number of days the person was ill during the last calendar year 
On clerks the following additional methods work: 
addIllDays: adds one to illDays 
getIllDays: returns the value of illDays 
display: adds the additional variable to the variables of Employee 
Class Director
Director is a derived class from Employee. A director has one extra instance variable: 
gratification: a double giving the fraction of the profit this director gets at the end of the year 
On director the following additional methods work: 
payGratification(int i): prints how much gratification the company pays to employee i 
display: adds the additional variable to the variables of Employee 
Class Company
Then there is the class Company. It has the following instance variables: 
numberOfEmployees: an integer 
profit: an integer 
employee: an array of Employee 

Methods working on companies are: 
Company(int maxSize): creates a company with an array of length maxSize   
   set Employee = new Employee[maxSize];
addClerk(int i) adds a clerk at the end of the employee array 
  employee[i] = new Clerk(members);
 addDirector(int i)() adds a director at the end of the employee array 
                employee[i] = new Director(members)
printCompany() prints the details of employees.
Class CompanyTest
On top of all, there is a class CompanyTest. It contains main method. It creates a company with 3 directors and 10 clerks.    
 */

class Employee{
    int age;
    int salary;
    public Employee(int age, int salary){
        this.age = age;
        this.salary = salary;
    }
    public void increaseSalary(double salaryIncrease){
        salary = (int) (salary * (1 + salaryIncrease));
    }
    public boolean checkRetirement(){
        if(age > 65){
            return true;
        }
        else{
            return false;
        }
    }
    public void paySalary(int i){
        System.out.println("Company pays salary to employee " + i);
    }
    public void display(){
        System.out.println("age: " + age + " salary: " + salary);
    }
}
class Clerk extends Employee{
    int illDays;
    public Clerk(int age, int salary, int illDays){
        super(age, salary);
        this.illDays = illDays;
    }
    public void addIllDays(){
        illDays++;
    }
    public int getIllDays(){
        return illDays;
    }
    public void display(){
        super.display();
        System.out.println("illDays: " + illDays);
    }
}

class Director extends Employee{
    double gratification;
    public Director(int age, int salary, double gratification){
        super(age, salary);
        this.gratification = gratification;
    }
    public void payGratification(int i){
        System.out.println("Company pays " + (int) (gratification * salary) + " to employee " + i);
    }
    public void display(){
        super.display();
        System.out.println("gratification: " + gratification);
    }
}
class Company{
    int numberOfEmployees;
    int profit;
    Employee[] employee;
    public Company(int maxSize){
        employee = new Employee[maxSize];
    }
    public void addClerk(int i){
        employee[i] = new Clerk(0, 0, 0);
    }
    public void addDirector(int i){
        employee[i] = new Director(0, 0, 0);
    }
    public void printCompany(){
        for(int i = 0; i < numberOfEmployees; i++){
            employee[i].display();
        }
    }
}

/**
 * CompanyTest
 */
public class CompanyTest {

    public static void main(String[] args) {
        Company company = new Company(10);
        company.addDirector(0);
        company.addDirector(1);
        company.addDirector(2);
        company.addClerk(0);
        company.addClerk(1);
        company.addClerk(2);
        company.addClerk(3);
        company.addClerk(4);
        company.addClerk(5);
        company.addClerk(6);
        company.addClerk(7);
        company.addClerk(8);
        company.addClerk(9);
        company.printCompany();
    }
}