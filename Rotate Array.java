
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n =arr.length ;
       d = d % n; 
        int temp[]=new int [d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
            
        }
        int j=0;
        for (int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
    }
}



class Solution {
    static void rotateArr(int arr[], int d) {
        int n =arr.length ;
       d = d % n; 
       reverse (arr,0,d-1);
       reverse (arr,d,n-1);
       reverse (arr,0,n-1);
    }
    public static  void reverse (int arr[],int start ,int  end ){
        while (start < end ){
            int temp =arr[start ];
            arr[start ]=arr[end ];
            arr [end ]=temp; 
            start ++;
            end --;
        }
    }
}
