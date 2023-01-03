package lessons.lesson20_exception;

public class Exceptions02_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr, 2);//* Veli
        getElementFromArray(arr, 0);//* Ali
        getElementFromArray(arr, 4);//* ArrayIndexOutOfBoundsException

    }

    // ?Bir String Array'den index girerek eleman elde edebilmek icin bir method olusturun.

    public static void getElementFromArray(String[] arr, int idx) {
        try {
            System.out.println(arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {
            //? Bu benim teknik olamayan aciklamam.
            System.out.println("Array indexte bir problem meydana geldi " + e.getMessage());
            //? Exception ile ilgili detaylica mesaj verir.
            e.printStackTrace();
            System.err.println("Array indexte bir problem meydana geldi");
        }
    }
}
