package DoubleCheckedLocking;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton doubleCheckedLockingSingleton=null;

    //to stop object creation from outside class;
    private DoubleCheckedLockingSingleton(){
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(doubleCheckedLockingSingleton==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(doubleCheckedLockingSingleton==null){
                    doubleCheckedLockingSingleton=new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;
    }
}
