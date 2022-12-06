package lessons.lesson08_loops;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        //* while-loop icin loop body'si icindeki kodun hic calistirilmama ihtimali vardir
        //* zero execution mumkundur

        int i = 1;
        while (i < 1) {
            System.out.println("While loop");
            i++;
        }

        //* do-while loop'un body'si icindeki kod her halukarda en az bie kere calisir
        //* zero execution mumkun degildir
        int k = 1;
        do {
            System.out.println("do-while loop");
            k++;
        } while (k < 1);

        //? Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz
        //?           24.5673 ==> 5+6+7+3 = 21 vermeli
        double num = 24.5673;
        String str = String.valueOf(num);
        String decimalPart = str.split("\\.")[1];
        int decimalInt = Integer.parseInt(decimalPart);
        int sum = 0;
        do {
            sum = sum + decimalInt % 10;
            decimalInt = decimalInt / 10;
        } while (decimalInt > 0);
        System.out.println(sum);
    }
}
