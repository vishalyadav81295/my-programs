import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int s=0;
            for(int i=1;(3*i)<n;i++){
               
                s=s+3*i;
                if((5*i)<n&&(5*i)%3!=0){
                    s=s+5*i;
                    
                }
            }
            System.out.println(s);
          
        }
    }
}

