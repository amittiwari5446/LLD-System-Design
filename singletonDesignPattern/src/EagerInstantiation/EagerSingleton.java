package EagerInstantiation;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton=new EagerSingleton();

    //to stop object creation from outside class;
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

}
/*
problems:-

1. Always creates object even when it is not required.
2. it is not thread safe, means if multiple threads try to access getInstance method
    it will creates seperate object for each threads.

*/
