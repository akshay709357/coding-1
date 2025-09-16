class Solution {
    public int nthUglyNumber(int n) {
        int [] arr = new int[n];
        arr[0] = 1;
        int count = 1 ;
        int num = 2;
        while(count < n){
            if(uglyNumber(num)){
                arr[count] = num ;
                count++;
            }
            num++;
        }
        return arr[n-1];
    }

    public boolean uglyNumber(int no){
        if(no <= 0)  return false;
        while(no % 2 ==0) no/=2;
        while(no % 3 ==0) no/=3;
        while(no % 5 ==0) no/=5;
        return no==1;
    }
}
