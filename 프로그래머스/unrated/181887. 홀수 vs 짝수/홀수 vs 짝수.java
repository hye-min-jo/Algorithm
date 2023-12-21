class Solution {
    public int solution(int[] num_list) {
        int hol=0;
        int chak=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                chak+=num_list[i];
            }
            else{
                hol+=num_list[i];
            }
        }
        if(hol>chak){
            return hol;
        }else{
            return chak;
        }
        
    }
}