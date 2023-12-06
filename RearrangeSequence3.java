import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=1;
            for(int i=0;i<n;i++){
                HashSet<Integer> hs=new HashSet<>();
                hs.add(arr[i]);
                int max=arr[i];
                int min=arr[i];
                int t=0;
                for(int j=i+1;j<n;j++){
                    if(hs.contains(arr[j])){
                        t++;
                    }
                    hs.add(arr[j]);
                    if(max<arr[j]){
                        max=arr[j];
                    }
                    if(min>arr[j]){
                        min=arr[j];
                    }
                    if((hs.size()==max-min+1) ){
                    ans=Math.max(ans,hs.size()+t);
                }
                }
                
                //for(int j=0;j<hs.size();j++){
                   // System.out.println(hs);
                //}
                
            }
            System.out.println(ans);

        }
    }
}