public class Factorial {

    public void factorial(){
        int number = 5; // You can change this number to calculate the factorial of a different value
        int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            fact *= i; // Multiply factorial by the current number
        }

        System.out.println("The factorial of :" + fact);
    }
    public static void main(string[]args){
        factorial obj= new Factorial();
        obj.factorial();
    }
}
