package checkPrime;

public class checkPrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = isPrimeNumber(i);
            if (isPrime){
                System.out.println(i);
            }
        }
    }

    static boolean isPrimeNumber(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
