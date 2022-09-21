package PerfectNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                result+=i;
            }
        }
        if (result==number){
            System.out.println("The Number You Entered is Perfect Number!!"+" "+number);
        }
        else {
            System.out.println("The Number You Entered is not Perfect Number!!"+" "+number);
        }
    }
}
