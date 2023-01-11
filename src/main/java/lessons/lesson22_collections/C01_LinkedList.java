package lessons.lesson22_collections;

import java.util.LinkedList;

public class C01_LinkedList {
    /*todo
        ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
        Cunku bircok elemanin re-index edilmesi gerekir.
        - Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
        - Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
        - LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
        - Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
          yerine "Node" kelimesini kullanmak yerinde olacaktir.
        - Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
        - Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.
       LinkedList eleman ekleme ve eleman silmede cok basarilidir.
       Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.
       Arraylist eleman bulma islemlerinde cok basarilidir.(search)
       Linkedlist ise eleman bulma islemlerinde basarisizdir.
       - Çoğunlukla arama yapılan bir çalışmaysa ArrayList kullAnılmalıdır.
       - Cok fazla ekleme cikarma yapmak gerekirse de Linkedlist kullanilmalidir.
  */

    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");

        System.out.println(visitors); //* [Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.add(2, "Angelina Julie"); //? inormalde bu kod index kullanmiyor.
                                                        //? Java developer'lar rahat etsinler diye
                                                        //? "buraya yazilan index'de nereye koymasini gerektigini gosteriyor.

        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors); //* [Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //* LinkedList'ler ekleme vesilme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors); //* [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); //* [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors); //* [Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");  //* Bu ismin ilk gorunumunu sil
        System.out.println(visitors); //* [Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");  //* Bu ismin son gorunumunu siler
        System.out.println(visitors); //* [Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

          /*todo
             Pops an element from the stack represented by this list.
             In other words, removes and returns the first element of this list.
             This method is equivalent to removeFirst().
             Throws:
             NoSuchElementException – if this list is empty (Eger List bossa)
         */
        String firstEl = visitors.pop(); //* Cut + Paste ===> Ctrl + x
        System.out.println(firstEl); //* Listedeki ilk elemani verir  // Tom
        System.out.println(visitors); //* Burda da pop ile verdigi elemani silmis olur.
        //* [Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]


        LinkedList<String> myList = new LinkedList<>();  //* Bos LinkedList

        //* myList.pop();  // NoSuchElementException atti cunku LinkedList bos

    }
}
