class Solution {
    public int countPrimes(int n) {


        int [] arr = new int[n];
        if (n > 0) arr[0] = 1;
        if (n > 1) arr[1] = 1;
       
        for(int i = 2  ; i < n ; i++){
            arr[i] = 0 ;
        }
        

        int count = 0 ;
        for(int i = 2; i < n ; i++){
           for(int j= i * 2; j < n ; j = j + i) {
                 if(j % i == 0) {
                    arr[j] = 1;
                 } 
           }
        }

      

        for(int x : arr){
            if(x == 0) {
                count++;
            }
        }

        return count;
    } 
   
    }
    //     if(n==0 || n==1) return 0;
    //     int count = 0;
    //     for(int i = 2 ; i  < n ; i++){
    //         if(isPrime(i)) {
    //             count++;
    //         } 
    //     }
    //     return count;
    // }

    // public boolean isPrime(int x) {
    //     for(int i=2;i*i<=x;i++){
    //         if(x % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


