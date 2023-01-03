package lessons.lesson20_exception;

public class Exceptions05_StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        System.out.println(getCharFromString("Java", 2)); //* v
        System.out.println(getCharFromString("Selenium", 8)); //* StringIndexOutOfBoundsException: Eger bir String'den bir karakter veya karakterler alirken olmayan bir index kullanilirsa
                                                                      //* StringIndexOutOfBoundsException alinir.

        System.out.println(getCharFromString("Muhammed", 5));
    }

    public static char getCharFromString(String str, int idx) {
        char harf = ' ';
        try {
            harf = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index ile ilgili bir problem olustu:  " + e.getMessage());
            e.printStackTrace();//* detayli log icin.
        }
        return harf;
    }
}
