package DAY6;

/* 수 조작하기2 */
class Solution3 {
    public String solution(int[] numLog) {
        String answer = "";
        /* for문을 이용하여 해당 문자열 길이만큼 진행 */
        for(int i=1;i<numLog.length;i++){
        	/* 해당원소와 그 다음 원소를 빼주면 연산 결과를 알수 있음*/
        	/* 따라서 해당 값에 따라 문자 넣기 */
            if(numLog[i]-numLog[i-1]==1){
                answer=answer+"w";
            }else if(numLog[i]-numLog[i-1]==-1){
                 answer=answer+"s";
            }else if(numLog[i]-numLog[i-1]==10){
                 answer=answer+"d";
            }else if(numLog[i]-numLog[i-1]==-10){
                 answer=answer+"a";
            }
        }
        return answer;
    }
}