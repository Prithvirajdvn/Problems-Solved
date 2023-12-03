import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        Map<Integer, Integer> c=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            c.put(a[i],c.getOrDefault(a[i],0)+1);
            //System.out.print(a[i]+" "+c.get(a[i])+" ");
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            if(c.get(x)==null){
                System.out.println("0");
            }else{
                System.out.println(c.get(x));
            }
        }
    }
}