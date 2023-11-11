class Solution {
    public int solution(int a, int b, int c) {
        
    
        int k=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        int l=(a+b+c)*(a*a+b*b+c*c);
        int j=a+b+c;
        
        if(a==b&&b==c){
            return k;
        }
        else if(a==b&&b!=c){
            return l;
        }
        else if(a==c&&b!=c){
            return l;
        }
        else if(c==b&&a!=c){
            return l;
        }
        else{
            return j;
        }
        
    }
}