package LazyInitialization;

public class LazySingleton {
    private static LazySingleton lazySingleton=null;

    //to stop object creation from outside class;
    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
//better than eager
/*
problems:-

1. it is not thread safe, means if multiple threads try to access getInstance method
    it will create seperate object for each thread.

*/
