package checkPrime;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn in ra");
        int number = scanner.nextInt();
        printPrimeNumber(number);
    }

    private static void printPrimeNumber(int number) {
        int count = 0;
        int printNumber = 2;
        do {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(printNumber); i++) {
                if (printNumber % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(printNumber + " ");
                count++;
            }
            printNumber++;
        }while (count<number);
    }
}
