// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [] arr = { 2 , 2 , 2 ,2 , 3 , 4 ,5 , 6};
        int target = 7 ;
        int count = countPairs(arr,target);
        System.out.println(count);
    }
    
    public static int countPairs(int [] arr , int target){
        int n = arr.length;
        int l = 0 , r = n-1 , count = 0;
        while(l < r){
            if(arr[l] + arr[r] == target){
                if(arr[l]==arr[r]){
                    int noOfElements = r-l+1;
                    count += ((noOfElements * (noOfElements-1))/2);
                    break;
                }else{
                    //find duplicates of same element
                    int leftValue = arr[l] , rightValue=arr[r];
                    int leftCount = 0, rightCount = 0;
                    while(l <=r && arr[l] == leftValue) {
                        l++;
                        leftCount++;
                    }
                    while(r >=l && arr[r] == rightValue) {
                        r--;
                        rightCount++;
                    }
                    //to get combinations we do mutiplications
                    count += (leftCount * rightCount);
                }
                
            }else if(arr[l]+arr[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return count;
    } 
    
    
}
