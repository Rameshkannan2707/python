import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int celcius = scanner.nextInt();
      double fahrenheit = (celcius*1.8)+32;
      System.out.format("%.2f",fahrenheit);
    }
}