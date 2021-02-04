package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // for(int; condition; increment)
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // for statement used to calculate 2-8 interest rate
        for(int i=2; i<9; i++) {
            System.out.println(calculateInterest(10000.0, i));
        }

        System.out.println("************************");

        for(int i=8; i>1; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }


        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
            }
            if(count == 3) {
                break;
            }
        }
        System.out.println("***************************************");

        int count2 = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count2++;
                sum += i;
                System.out.println("Number " + i + " is divisible by 3 & 5");
            }
            if(count2 == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("****************************");

        int count3 = 6;
//        while(count3 != 6) {
//            System.out.println("Count value is " + count3);
//            count3++;
//        }
//
//        for(int i=6; i!=6; i++) {
//            System.out.println("Count value is " + count3);
//        }

//        count3 = 1;
//        do {
//            System.out.println("Count value was " + count3);
//            count3++;
//
//            if(count3 > 100) {
//                break;
//            }
//        } while(count3 !=6);

//        while(true) {
//            if(count3 == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count3);
//            count3++;
//        }

    }
    // Create a method called isEvenNumber that take a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // Return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // If it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // If that count is 3 exit the for loop
    // hint: Use the break; statement to exit

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
