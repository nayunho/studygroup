package Day2;
import java.util.*;

class Solution5 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        List list = new ArrayList();
        for(int i=0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            list.add(c);
        }
        
        for(int j=0;j<overwrite_string.length();j++){
            char c2 = overwrite_string.charAt(j);
            list.set(s+j,c2);
        }
        for(int k=0;k<list.size();k++){
            answer+=list.get(k);
        }
        
        return answer;
    }
}