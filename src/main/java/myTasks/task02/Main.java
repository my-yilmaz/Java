package myTasks.task02;

public class Main {
    public static void main(String[] args) {
        Kedi hayvan1 = new Kedi("Minnoş");
        Kopek hayvan2 = new Kopek("Karabaş");

        // Abstraction (Soyutlama): Ortak metot kullanımı
        hayvan1.sesCikar();
        hayvan1.beslen();

        hayvan2.sesCikar();
        hayvan2.beslen();
    }
}