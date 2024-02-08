package progremmers;

class Solution5 {
	/* flag에 따라 다른 값 반환하기 */
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        /* if문으로 flag가 참인지 거짓인지 판단 그래서 해당 연산 진행*/
        if(flag==true){
            answer=a+b;
        }else if(flag==false){
             answer=a-b;
        }
        return answer;
    }
}