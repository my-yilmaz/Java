package lessons.lesson23_maps;

import java.util.HashMap;

public class C01_HashMap {

    /*todo
       1) Map'ler key-value structure kullanir, metodun sol tarafina key, sag tarafina value denir
       2) Key'ler unique'dir, tekrarsiz data icerir
       3) Value'lar tekrarli data icerebilir, unique olmak zorunda degil
       4) Map'lerde eleman degil EntrySet kullaniriz
       5) Key'ler de null tekrarasiz olarak kullanilir
       6) Value'lar null kabul eder
       7) HashMap'ler EntySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
       8) Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
       9) Collection'larda "[]" kullanilirken, Map'lerde "{}" kullanilir
     */

    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);

        System.out.println(studentAges);

    }
}
