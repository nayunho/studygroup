package DAY5;

/* 등차수열의 특정한 항만 더하기 */
class Solution2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int cnt=a;
        int result=0;
        /* for문으로 해당 문자열 길이 만큼 반복 진행 */
        for(int i=0;i<included.length;i++){
        	/* 해당 배열의 원소가 true일떄만 if문 실행 */
            if(included[i]==true){
                result=result+cnt;
            }
            cnt=cnt+d;
        }
        answer=result;
        return answer;
    }
}

