package Interface;
interface Inter1{
    // Marker interface if no methods and field
    // functional interface if at least 1 method is there
    int x=112;       // public static final
    void method1();    // public abstract
}
interface Inter2{
    int x=115;
    void method3();

}
public class Test1 implements Inter1,Inter2 {
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
        System.out.println(Inter1.x);
        int x = 113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is my method1");
    }
    public void method3(){
        System.out.println("This is my method3");
    }
}
