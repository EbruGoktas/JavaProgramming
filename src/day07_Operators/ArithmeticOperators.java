package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1= 9;
        int num2= 3;

        int division=num1/num2;
        int remainder=num1%num2;

        System.out.println(num1+" divide by "+num2+" is equal to "+division+" with a remainder of "+remainder);

        System.out.println(25%4);
        System.out.println(25%5);

        // 10 divide by 3 is equal to 3 with a remainder of 1



    }
}
/*
Arithmetic operators:
		20 / 6 = 3
		20.0 / 6 = 3.333....

		10/2 = 5
		10/3 = 3.3333...

		remainder = numerator -(denominator * integer result)
				     10      - (3 * 3) = 1

				     1/3 = 0.3333....

	     10 % 3 ==> 1

	     45 / 8 = 5.625

	     		45 - (8 * 5 ) =5


		 45 % 8 ===> 5


		 100 % 15 ==> 10

		 100 / 15 = 6.66.....
		 100 - (15 * 6) = 10
 */
