package myTasks.task03.SingletonClass;

public class Test {
    public static void main(String[] args) {
        // Logger örneğine erişim
        Logger logger1 = Logger.getInstance();
        logger1.log("Bu bir log mesajıdır.");

        // Farklı bir Logger örneğine erişim
        Logger logger2 = Logger.getInstance();
        logger2.log("Bu da başka bir log mesajıdır.");

        // logger1 ve logger2 aynı örneği temsil eder
        System.out.println(logger1 == logger2);  // true
    }
}