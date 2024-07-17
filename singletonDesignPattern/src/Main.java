public class Main {
    public static void main(String[] args) {
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        Singleton z=Singleton.getInstance();

        x.s=x.s.toLowerCase();

        System.out.println("string from y: ");
        y.showMessage();

        System.out.println("string from z: ");
        z.showMessage();

        System.out.println("string from x: ");
        x.showMessage();
    }
}