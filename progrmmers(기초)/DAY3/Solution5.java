package Day3;

/* 두 수의 연산값 비교하기 */
class Solution5 {
    public int solution(int a, int b) {
        int answer = 0;
        /* ""문자열을 더해줘서 문자열을 만든다. */
        String result1=a+""+b;
        int result2=2*a*b;
        
        /* Integer.parseInt로 문자열을 정수로 변환 / if문으로 해당 값 판단 */
        if(Integer.parseInt(result1) > result2){
            answer=Integer.parseInt(result1);
        }else if(Integer.parseInt(result1) <result2){
            answer=result2;
        }else{
            answer=Integer.parseInt(result1);
        }
        return answer;
    }
}
