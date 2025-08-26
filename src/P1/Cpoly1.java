// compile time metamorphism
package P1;
// Static or early binding
public class Cpoly1 {
    Cpoly1(){

    }
    Cpoly1(int a){

    }
    public static void main(String[] args) {
        System.out.println("A");
        Cpoly1 cc = new Cpoly1();
        cc.m1();
    }
    public static void main() {
        System.out.println("D");
    }
    void m1(int a){
        System.out.println("B");
    }
    void m1(int a, String b){
        System.out.println("B");
    }
    void m1(){
        System.out.println("C");
    }
}
