package FriendNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        if(number1>number2){
            friendNumberChecker(number1,number2);
        }
        else {
            friendNumberChecker(number2,number1);
        }

    }
    public static void friendNumberChecker(int max,int min){
        int maxDivider=0;
        int minDivider=0;
        for(int i=1;i<max;i++){
            if (max%i==0){
                maxDivider+=i;
            }
            if (min%i==0 && i<min){
                minDivider+=i;
            }
        }
        if (maxDivider==min && minDivider==max){
            System.out.println("Numbers are Friend Numbers!!!!");
        }
        else {
            System.out.println("Numbers are not Friend Numbers!!!!");
        }
    }
}
