public class SumOddRange {

    public static void main(String[] args) {

        int start = 100;
        int end = 1000;
        System.out.println("Sum of odd numbers from " + start + " to " + end + ": " + sumOdd(start, end));
    }

    public static boolean isOdd(int number){
        if(number <=0) {
            return false;
        }
       return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
       if (start <= 0 || end <= 0 || end < start) { // If the value is negative, return a -1
           return -1;
       }

       int sum =0;
        for (int i = start; i <= end ; i++) {
            if (isOdd ( i )) {
                sum += i;
            }
        }
        return sum;
    }
}

//Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//Check that number is > 0, if it is not return false.
//If number is odd return true, otherwise return false.
//Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//The method should use a for loop to sum all odd numbers in that range, including the end and return the sum.
//It should call the method isOdd to check if each number is odd.
//The parameter end needs to be greater than or equal to start, and both start and end parameters have to be greater than 0.
//If those conditions are not satisfied, return -1 from the method to indicate invalid input.

