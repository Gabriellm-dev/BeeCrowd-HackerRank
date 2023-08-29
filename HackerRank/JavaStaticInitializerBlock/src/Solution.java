import java.io.*;
import java.util.*;
public class Solution {

    static {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();
        sc.close();

        try {
            if (width <= 0 || height <=0){
                throw new Exception("Breadth and height must be positive");
            }
            else {
                int parallelogram = width * height;
                System.out.println(parallelogram);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
    }
}
