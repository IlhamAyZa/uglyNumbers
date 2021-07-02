package uglynumbers;

import java.util.Scanner;

public class UglyNumbers {

    public static void main(String[] args) {

        Scanner ans = new Scanner(System.in);

        System.out.print("Input : ");
        int idxOfNumber = ans.nextInt();

        ans.close();

        int count = 0;
        int outputNumber = 0;
        int number = 0;
        
        int loop = 0;

        while (count < idxOfNumber) {

            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {

                //System.out.println("______________");

                outputNumber = number;
                count++;

                //System.out.println(outputNumber + " " + count);
                //System.out.println("______________");

                //System.out.println(number);
                
            }
            
            number++;
            

        }

        System.out.println("Output : " + outputNumber);

    }

}
