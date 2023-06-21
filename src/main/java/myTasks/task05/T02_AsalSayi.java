package myTasks.task05;

public class T02_AsalSayi {
    //todoŞ 100 den kucuk asal sayilari yazdiran bir code create ediniz.
    public static void main(String[] args) {
        System.out.println("100'den küçük asal sayılar:");

        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden yardımcı metot
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

