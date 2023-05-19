package myTasks.task02;

class Kopek extends Hayvan implements SesCikarabilen {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public void beslen() {
        System.out.println(getIsim() + " kemik yiyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim() + " havlıyor: Hav hav!");
    }
}