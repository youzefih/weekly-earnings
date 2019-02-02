import java.util.Scanner;

public class WeeklyEarnings {

public int Pay(double salaryPerHour,double hoursWorked) {
int totalComp;

if(hoursWorked>8.00) {
totalComp = salaryPerHour * 8;
double temp = (salaryPerHour*1.5)(hoursWorked-8.00);
totalComp = (Integer)temp + totalComp;
return totalComp;
}
else {
totalComp = salaryPerHour * hoursWorked;
return totalComp;
}


}
public static void main (Strings [] args) {

Scanner scan = new Scanner(System.in);
System.out.println("What is your compensation per hour?");
double SalaryPerH = scan.nextDouble();
System.out.println("How many hours have you worked today?");
double hours = scan.nextDouble();


System.out.println(Pay(SalaryPerH,hours));



}
    }