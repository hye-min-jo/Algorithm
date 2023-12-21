import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> five=new ArrayList<String>();
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                five.add(names[i]);
            }
        }
        return five.toArray(new String[0]);
    }
}