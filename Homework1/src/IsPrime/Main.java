package IsPrime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SAYI ASAL MI ?
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x <= 2 && x>= 0){
            System.out.println("The Number is Prime!"+"  "+x);
        }
        else if (x<0){
            System.out.println("The Number is Negative!"+"  "+x);
        }
        else {
            int i ;
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println("The Number is not Prime!" +"  "+x);
                    isPrime= false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("The Number is Prime" +"  "+x);
            }
        }
    }
}