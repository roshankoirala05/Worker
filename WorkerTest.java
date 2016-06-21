public class WorkerTest
{
//Driver file to test the Worker class
//test your program incrementally
//move the block comments down as you add methods
public static void main (String args[])
{

//create and display some objects to test constructors and toString

Worker harry = new Worker ("Harry Potter", "123456789", "skilled", 2);
System.out.println(harry);

Worker ron = new Worker ("Ron Weasley", "234567890", "expert", 3);
System.out.println(ron);

Worker malfoy = new Worker();
System.out.println(malfoy);

//test the promote method

//should print Harry received a promotion
if (harry.promote())
   System.out.println("Harry received a promotion");
else 
   System.out.println("Not eligible for promotion");
  
//should print Not eligible for promotion  
if (ron.promote())
   System.out.println("Ron received a promotion");
else 
   System.out.println("Not eligible for promotion");
  
  
//test demote
ron.demote();
System.out.println(ron);   //check to see that Ron is now at skilled

// check calcInsuranceCost
//after you check the cost for harry
//change the variable name to ron and malfoy to test others
double cost = malfoy.calcInsuranceCost();
System.out.printf("Cost for insurance per week: $%.2f", cost);

//check calcGrossPay
//as above change variable names to other workers to fully test
//ron's pay should be 1158.00
double pay = ron.calcGrossPay(45.5);
System.out.printf("Gross pay for the week $%.2f\n", pay);

//check calcLeave --remember to do all your getters and setters
//to fully test, change months and levels
ron.setMonths(80);
System.out.println(ron.calcLeave());

} //end main
} //end class