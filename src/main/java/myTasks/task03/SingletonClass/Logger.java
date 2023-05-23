package myTasks.task03.SingletonClass;

public class Logger {
    private static Logger instance;

    // Constructor'ı private olarak tanımlayarak doğrudan örnekleme yapılmasını engelliyoruz
    private Logger() {
    }

    // getInstance() metoduyla Logger örneğine erişim sağlıyoruz
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logger sınıfının diğer metotlarını buraya ekleyebiliriz
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}