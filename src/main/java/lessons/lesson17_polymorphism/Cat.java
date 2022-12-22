package lessons.lesson17_polymorphism;

public class Cat extends Mammal {
    public void  meow(){
        System.out.println("Cats meow");
    }

    @Override //?  @Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kurallarini kontrol etmesini saglariz.
    public void eat() {

        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a + b +1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b + 1;
    }

    //! Asagidaki method "Overriding Method" dur
    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*TODO:
       @Override annotation'ini kullanarak, Java'nin yaptığımız Override işlemini kontrol etmesini sağlarız.
       1) Override yaparken "method'un body" si degistirilir. (amac methodun uygulamasini degistirmek)
       2) Override yaparken ASLA method signutare(isim ve parametre) degistirilemez.
       3) Override yaparken "inheritance" olmak zorundadir.
       4) Override yaparken "access modifier" lar belli kurallara gore farklilastirilabilirler.
            i) "private" method'lar override edilemezler.
           ii) Child Class'daki "override edilen" method'un access modifier'i Parent Class'daki
               method'un access modifier'ı ile aynı veya geniş olmalıdır.
               Note: Child Class'daki method'un access modifier'i daha dar olamaz.
           iii) default method'lar ayni package icinde ise override edilebilirler.,
               farkli package'dan override edilemezler.
       5) Parent Class'taki methodun "return type" i void ise "return type" degistirilemez.
       6) Parent Class'taki methodun "return type" i primitive ise "return type" degistirilemez
       7) Parent Class'taki methodun "return type" i Wrapper Class ise "return type" degistirilemez
       8) Parent Class'taki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
          Note: Child Class'taki return type Parent Class'takinden genis olamaz.
          Note: Aralarinda "Parent-Child" iliskisi olmayan Calss'lar overrideing'de Return Type
                degisiminde kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat aralarinda "Parent-Child"
                iliskisi olmadigindan "Integer" yerine "Short" kullanamazsiniz.
          Note: Child'daki method'un Return Type'indan Parent'taki methodun Return Type'ina gidiste
                "IS-A" Relationship olmali.
          Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
       9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
       10) "final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir
          fakat "final" method body degistirilmesine musaade etmez.
       11) Polymorphism(Coklu Yapi) = Overloading(Method'un parametrelerini degistiriyoruz) + Overriding(Method'un body'sini degistiriyoruz)
         Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin.
       12) Overloading ile Overriding arasindaki farklar nelerdir?
          i) Overloading icin "Inheritance" gerekmez fakat Overriding(Parent'tan alip degistiririz) icin gerekir.
         ii) "private" method'lar Overload edilebilir ancak Override edilemezler(cunku baska Classtan yapilir).
         iii) "final" method'lar Overload edilebilir ancak Override edilemezler
         iv) "Overloading" "static polymorphism" olarak, "Overriding" "dinamik polymorphism" olarak adlandirilir.
            Cunku "static" methodlar Overload edilebilir, Override edilemezler.
         v) "Overloading" de method signature degisir ancak "Overriding" de method signature'a dokunulmaz.
    */

}
