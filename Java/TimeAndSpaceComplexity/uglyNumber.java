class Solution {
    public boolean isUgly(int n) {
       if(n <= 0) return false;
       while(n%2==0){
           n/=2;
       }
       while(n%3==0){
           n/=3;
       }
       while(n%5==0){
           n/=5;
       }
       return n==1;
       
       
        // if (n <= 0) return false;
        // if (n == 1) return true;
        // Set<Integer> res = new HashSet<>();
        // while(n%2==0){
        //     res.add(2);
        //     n/=2;
        // }
        // for(int i = 3;i * i <= n ;i++){
        //     while(n % i==0){
        //         res.add(i);
        //         n/=i;
        //     }
        // }
        // if(n>2){
        //     res.add(n);
        // }

        // boolean ans = true ;
        // for(int x : res){
        //     if(x == 2 || x == 3 || x == 5){
        //         ans = true;
        //     }else{
        //       ans = false;
        //       break;
        //     }
        // }
        // return ans;
    }
}
