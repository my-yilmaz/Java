package lessons.lesson23_maps;

import java.util.*;

public class C01_HashMap {

    /*todo
       1) Map'ler key-value structure kullanir, metodun sol tarafina key, sag tarafina value denir
       2) Key'ler unique'dir, tekrarsiz data icerir
       3) Value'lar tekrarli data icerebilir, unique olmak zorunda degil
       4) Map'lerde eleman degil EntrySet kullaniriz
       5) Key'ler de null tekrarasiz olarak kullanilir
       6) Value'lar null kabul eder
       7) HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
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
        studentAges.put("Ali", 88); //* Ayni key degerini tekrar kullandigimizda hata vermez "overwrite" yapar.
        studentAges.put(null, 75);
        studentAges.put(null, 29);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);

        System.out.println(studentAges); //* {null=29, Ayhan isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //! Map'den sadece key'ler nasil alinir

        Set<String> keys = studentAges.keySet();
        System.out.println(keys); //* [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        //! Map'den sadece value'ler nasil alinir

        Collection<Integer> values = studentAges.values();
        System.out.println(values); //* [29, null, null, 21, 76, 12, 75, 88]

        //! Belirli bir key'in value'si nasil alinir

        Integer tomAge = studentAges.get("Tom");
        System.out.println(tomAge); //* 21

        //? Example 1: Tum Integer yaslarin ortalamasini hesaplayan kodu yasiniz
        Collection<Integer> ages = studentAges.values();
        int sum = 0;
        double counter = 0;
        for (Integer w : ages) {
            if (w != null) {
                sum += w;
                counter++;
            }
        }
        System.out.println("Ortalama yas: " + (sum / counter)); //* Ortalama yas: 50.166666666666664

        //? Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        //*            [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
        Set<String> names = studentAges.keySet();
        int sum1 = 0;

        for (String w : names) {
            if (w != null && !w.startsWith("A")) {
                sum1 += w.length();
            }
        }
        System.out.println(sum1); //* 25


        //* remove("Ajda",76) key'si Ajda value'su 76 olan EntrySet'i siler ve size boolean return eder.

        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result); //* true

        Integer result1 = studentAges.remove(null);
        System.out.println(result1); //* 66

        //* Key varsa value'u verir, key yoksa sizin istediginiz degeri verir(ikinci parametreyi)
        Integer result2 = studentAges.getOrDefault("Tom", 0);
        System.out.println(result2); //* 21

        Integer result3 = studentAges.getOrDefault("Tomy", 0);
        System.out.println(result3); //* 0

        //* Value null ise ekleme yapar, value null degilse ekleme yapmaz
        Integer result4 = studentAges.putIfAbsent("Tom", 100);
        System.out.println(result4); //* 21

        Integer result5 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result5);
        System.out.println(studentAges); //* {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //* Key yoksa ekleme yapar
        Integer result6 = studentAges.putIfAbsent("Zeki Muren", 66);
        System.out.println(result6);
        System.out.println(studentAges); //* {Ayhan Isik=100, Zeki Muren=66, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //* replace() method'u value'leri key'e bakarak degistirdi
        studentAges.replace("Zeki Muren", 55);
        System.out.println(studentAges); //* {Ayhan Isik=100, Zeki Muren=55, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //* replace() method'u value'leri key ve value'lari kontrol ettikten sonra degistirdi
        studentAges.replace("Zeki Muren", 55, 88);
        System.out.println(studentAges); //* {Ayhan Isik=100, Zeki Muren=88, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //? Example 3: Map'deki herbir entry'yi ekrana farkli bir satirda olacak sekilde yazdiriniz.
        //* entrySet() method'u Map'teki elemanlari bir Set'in icine koyarak size verir

        Set<Map.Entry<String, Integer>> entrySet = studentAges.entrySet();
        for (Map.Entry<String, Integer> w : entrySet
        ) {
            System.out.println(w);
        }
    }
}
