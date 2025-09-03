package Exception;

import java.io.FileInputStream;

public class Exception1 {
    public static void main(String[] args) {


        try {
            FileInputStream fs = new FileInputStream("Desktop/Java/CSD/aab.java");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");
        System.out.println("Hi");
        System.out.println("Helloooooo");
        System.out.println("Helllllllo");
        try {
            System.out.println(200 / 0);     //uncheck exception
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        String CSD = null;
        System.out.println(CSD.length());
        System.out.println("Hnghbello");
        System.out.println("Hehtgfllo");
        System.out.println("Hy65trgello");

    }
}
