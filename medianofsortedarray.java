class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] a=new int[n+m];
        int i=0,j=0,k=0;
        while(i!=n || j!=m){
            if(i==n && j<m){
                a[k++]=nums2[j++];
                continue;
            }
            if(j==m && i<n){
                a[k++]=nums1[i++];
                continue;
            }

            if(nums1[i]<nums2[j]){
                a[k++]=nums1[i++];
            }else{
                a[k++]=nums2[j++];
            }
        }
        float r=0;
        if((n+m)%2==0){
            int mi=(n+m)/2;
            r=(float)(a[mi]+a[mi-1])/2;
        }
        else{
            int mi=(n+m)/2;
            //System.out.println(mi);
            r=a[mi];
        }
       /* for(i=0;i<n+m;i++){
            System.out.print(a[i]+" ");
        }*/
        return r;
    }
}