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
            int ans=0;
            for(int i=0;i<n;i++){
                int max=arr[i],min=arr[i];
                HashSet<Integer> hs=new HashSet<>();
                for(int j=i;j<n;j++){
                    if(max<arr[j]){
                        max=arr[j];
                    }
                    if(min>arr[j]){
                        min=arr[j];
                    }
                    if(!hs.contains(arr[j])){
                        hs.add(arr[j]);
                    }

                    if(hs.size() == (max-min+1)){
                        ans=Math.max(ans,hs.size());
                    }
                }
                
            }
            System.out.println(ans);
        }
    }
}