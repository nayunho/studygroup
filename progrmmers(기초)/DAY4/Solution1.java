package progremmers;

class Solution1 {
	/* n의 배수 */
    public int solution(int num, int n) {
        int answer = 0;
        /* if문을 이용해 num이 해당 숫자 n으로 나누었을떄 0이면 해당숫자의 배수 */
        if(num%n==0){
            answer=1;
        }else {
            answer=0;            
        }
        
        return answer;
    }
}