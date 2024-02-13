package DAY5;

import java.util.*;
/* 주사위 게임 2 */
class Solution3 {
    public int solution(int a, int b, int c) {
        int answer = 0;
       
        /* if~else if 문으로 여러 조건을 실행 가능 */
        if(a!=b && b!=c && a!=c){
            answer=a+b+c;
        }else if((a==b && b!=c) || (a!=b && b==c) || (a==c && b!=c)){
            answer=(a+b+c)*(a*a+b*b+c*c);
        }else if(a==b && b==c){
            answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
         return answer;
    }
}
