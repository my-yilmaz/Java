package lessons.lesson17_constructor.constructo1;

public class Runner {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a); //* 14  Cat classindaki a degeri
        System.out.println(cat1.b); //* 34 Cat classinda b degeri yoksa parrant classindaki(Mammal) b degerini yazdirdi
        System.out.println(cat1.c); //* 45 Cat classinda b degeri yoksa parrant classindaki(Animal) c degerini yazdirdi

        Mammal cat2 = new Cat();

        System.out.println(cat2.a); //* 13 Mammal classindaki a degeri

        Animal cat3 = new Cat();

        System.out.println(cat3.a); //* 12 Animal classindaki a degeri

        //todo Object olustururken Object'in data type'i child class'lardan secilemez.

        //? Inheritance'da method'lar secilirken Java Constructor'a bakar.   **********
        //? Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir
        //? O Class'ta bulamazsa Parent Class'lara bakar.
        //? Hicbir yerde o methodu bulamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat(); //* Cats eat...
        cat4.drink(); //* Mammal drink


        Mammal cat5 = new Mammal();
        cat5.eat();//* Mammal eat...
        cat5.drink(); //* Mammal drink

        Animal cat6 = new Animal();
        cat6.eat();//* Animals eat...

    }

}








