package myTasks.task02;

// Alt sınıf: Kedi
class Kedi extends Hayvan implements SesCikarabilen {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public void beslen() {
        System.out.println(getIsim() + " balık yiyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim() + " miyavlıyor: Miyav!");
    }
}
