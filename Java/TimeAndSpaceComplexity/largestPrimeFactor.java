// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        Set<Integer> res = new HashSet<>();
        
        while(n % 2 == 0){
            res.add(2);
            n /= 2;
        }
        
        for(int i= 3 ; i * i <= n ; i += 2 ){
            while(n%i==0){
                res.add(i);
                n /= i ;
            }
        }
        
        if(n>2){
            res.add(n);
        }
        
        int max = 1;
        for(int x : res){
            if(x > max) {
                max = x ;
            }
        }
        return max;
        
    }
}
