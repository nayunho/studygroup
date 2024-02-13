package DAY5;


/* 이어 붙인 수 */
class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String result1="";
        String result2="";
        
        /* for문으로 해당 문자열 길이만큼 진행 */
        for(int i=0;i<num_list.length;i++){
        	/* if문으로 해당 문자가 짝수인지 홀수 인지 판단 */
            if(num_list[i]%2==0){
                result1=result1+(num_list[i]);
            }else{
                result2=result2+(num_list[i]);
            }
        }
        /* Integer.parseInt로 문자열을 정수로 전환 */
        int even = Integer.parseInt(result1);
        int odd = Integer.parseInt(result2);
        
        answer=even+odd;
        
        return answer;
    }
}