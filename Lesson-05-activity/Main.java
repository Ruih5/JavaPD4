class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
  int x1=10;
  int x2 = -90;
  int sum = x1+x2;
  System.out.println("the sum is :"+sum);

/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
  int g1= 90;
  int g2= 85;
  int g3= 95;
  int equal =g1+g2+g3;
 System.out.println("The grade is"+equal); 


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

   average = equal / 3.0;
   System.out.println("The average grade is: " + average);



/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
    int a = 10;   
    int x = 5;    
        int y = a / (x + 1);

    System.out.println("The value of y is equal to : " + y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
        int a1 = 8; 
        int x1 = 4;   

        int y1= 2 * x * (x1 + 1) * (-x1 / 2) / a1;

        System.out.println("The value of y is: " + y1);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
        int b = 20;  
        int h = 5;

        int area = 0.5 * b * h;

        System.out.println("The area is: " + area);





/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}