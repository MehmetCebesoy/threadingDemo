public class Main {

    public static void main(String[] args) {
        KronometreThread thread1 = new KronometreThread("treadName1");

        KronometreThread thread2 = new KronometreThread("treadName2");

        KronometreThread thread3 = new KronometreThread("treadName3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
