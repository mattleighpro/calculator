import java.util.Scanner;


public class App {

static final Scanner inputScanner = new Scanner(System.in);

/* private static String getString (String prompt){

    System.out.println(prompt);
    String word = inputScanner.nextLine();
    return word;
}
*/

private static double getDouble (String prompt){
    System.out.println(prompt);
    double num = inputScanner.nextDouble();
    return num;
}


    public static void main(String[] args){
    
   String repeat = "Y";    

     while (repeat.equals("Y")) {

        //String word1 = getString("Please enter a word:");
        double num1 = getDouble("Please enter a number:");
        double num2 = getDouble("Please enter a second number:");
       
        //String message = String.format("You want to add %f + %f", num1, num2);
        //System.out.println(message);
    
        double sum1 = Calculator.add(num1, num2);
        String addition = String.format("The addition of %f + %f = %f", num1, num2, sum1);
        System.out.println(addition);

        double diff1 = Calculator.subtract(num1, num2);
        String subtraction = String.format("The subtraction of %f - %f = %f", num1, num2, diff1);
        System.out.println(subtraction);

        double prod1 = Calculator.multiply(num1, num2);
        String product = String.format("The multiplication of %f * %f = %f", num1, num2, prod1);
        System.out.println(product);

        double quot1 = Calculator.divide(num1, num2);
        String quotient = String.format("The division of %f / %f = %f", num1, num2, quot1);
        System.out.println(quotient);
    
        System.out.println("Would you like to continue? Please Enter Y or N: ");
        repeat = inputScanner.nextLine();
        inputScanner.nextLine();
        repeat.toUpperCase();
        
    }  
    
    System.out.println("Goodbye");
    
    }
}