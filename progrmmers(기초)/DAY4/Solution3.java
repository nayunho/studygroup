package progremmers;

class Solution3 {
	/* 홀짝에 따라 다른 값 반환하기 */
	public int solution(int n) {
        int answer = 0;
        /* if문을 이용해 홀/짝 판단 */
        if(n%2==0){
        	/* for문을 이용해 해당 배열 값의 제곱의 합을 구함 */
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    answer=answer+i*i;
                }else{
                    continue;
                }
            }
        }else{
        	
        	/* for문을 이용해 해당 배열의 값이 홀수 일대 합을 구함 */
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    answer+=i;
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}