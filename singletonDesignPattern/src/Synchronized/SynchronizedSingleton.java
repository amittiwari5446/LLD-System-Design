package Synchronized;

public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingleton=null;

    //to stop object creation from outside class;
    private SynchronizedSingleton(){
    }

    public static synchronized SynchronizedSingleton getInstance(){
        if (synchronizedSingleton==null){
            synchronizedSingleton=new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
//better than lazy
/*
problems:-

1. it is thread safe, but it will reduce the efficiency of the program because
    it will check for synchronization every time a thread try to access the
    getInstance() method.

*/
