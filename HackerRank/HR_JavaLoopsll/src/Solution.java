import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = 0;

            for(int j=0; j<n;j++){
                if (j == 0) {
                    s = s + a + (int) (Math.pow(2, j) * b);
                    System.out.println(s+" ");

                }
                else {
                    s = s + (int) (Math.pow(2, j) * b);
                    System.out.println(s + " ");
                }
            }
            System.out.println("");
        }
        in.close();
    }
}