package myTasks.task02;

// Ana sınıf: Hayvan
abstract class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    // Soyut metot: Beslenme şekli
    public abstract void beslen();
}
