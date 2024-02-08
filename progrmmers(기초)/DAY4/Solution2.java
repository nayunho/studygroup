package progremmers;

class Solution2 {
	/* 공배수 */
	 public int solution(int number, int n, int m) {
	        int answer = 0;
	        /* 숫자 n과 m으로 나누어 떨어지면 그 숫자는 공배수 */
	        if(number%n==0 && number%m==0){
	            answer=1;
	        }else{
	            answer=0;
	        }
	        return answer;
	    }
}