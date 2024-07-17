public class Singleton {
    private static Singleton singleInheritance=null;
    public String s;
    public Singleton(){
        s="Hello, I am a part of singleton class";
    }
    public static Singleton getInstance(){
        if(singleInheritance==null){
            singleInheritance=new Singleton();
        }
        return singleInheritance;
    }
    public void showMessage(){
        System.out.println(s);
    }
}
