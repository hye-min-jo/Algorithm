import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished){
        ArrayList<String> anList = new ArrayList<String>();
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                anList.add(todo_list[i]);
            }
        }
        String[] an = new String[anList.size()];
        an=anList.toArray(an);
        
        return an;
    }
}