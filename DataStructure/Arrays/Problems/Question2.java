

// Write an efficient program to count the number of 1s in the binary representation of an integer
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.bitCount(n));

    }

    
}
