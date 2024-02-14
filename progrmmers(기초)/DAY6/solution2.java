package DAY6;

/* 수 조작하기1 */
class Solution2 {
    public int solution(int n, String control) {
        int answer = n;
        /* for문을 이용하여 해당 문자열 길이만큼 진행 */
        for(int i=0;i<control.length();i++){
        	/* 인덱스 위치에 해당되는 문자 출력 */
            char result = control.charAt(i);
            
            /* 그 값에 따라 연산 수행 */
            if(result=='w'){
                  answer=answer+1;
            }else if(result=='s'){
                  answer=answer-1;
            }else if(result=='d'){
                  answer=answer+10;
            }else if(result=='a'){
                  answer=answer-10;
            }
        }
        return answer;
    }
}
