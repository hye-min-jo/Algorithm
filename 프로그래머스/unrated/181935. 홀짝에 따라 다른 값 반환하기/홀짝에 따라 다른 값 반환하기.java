class Solution {
    public int solution(int n) {
        int k=0;
        if(n%2==0){
            for(int i=0;i<=n;i+=2){
                k+=i*i;
            }
            
        }
        else{
            for(int i=1;i<=n;i+=2){
                 k+=i;
            }    
        }
        return k;
    }
}