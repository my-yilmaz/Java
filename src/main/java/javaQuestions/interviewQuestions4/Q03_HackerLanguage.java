package javaQuestions.interviewQuestions4;

public class Q03_HackerLanguage {
/*TODO:
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3r53y guz3l
    İpucu harfleri değiştirin ve ekrana yazdırın.
 */


    public static void main(String[] args) {
        String metin = "java ile hersey guzel";
        String hackerMetin = hackerDili(metin);
        System.out.println(hackerMetin); // j4v4 il3 h3rs3y guz3l
    }

    public static String hackerDili(String metin) {
        return metin.replaceAll("s", "5")
                .replaceAll("a", "4")
                .replaceAll("e", "3")
                .replaceAll("i", "1")
                .replaceAll("o", "0");
    }
}
