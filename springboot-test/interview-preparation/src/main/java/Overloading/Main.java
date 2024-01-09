package Overloading;

public class Main {

      static void printStuff(int i) {
            System.out.println(i);
      }

      static void printStuff(double d) {
            System.out.println(d);
      }

      static void printStuff(int x, int y) {
            System.out.println(x + " " + y);
      }

      public static void main(String[] args) {
            printStuff(1);
            printStuff(1.0);
            printStuff(1, 1);
      }
}
