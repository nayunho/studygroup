package Day3;

/* 더 크게 합치기 */
class Solution4 {
    public int solution(int a, int b) {
        int answer = 0;
        /* 해당 정수를 문자열로 만들어 주기위해 ""문자열을 더해준다. */
        String result1=a+""+b;
        String result2=b+""+a;
        /* Integer.parseInt로 해당 문자열을 숫자로 변경/ if문으로 비교해서 참것 판단 */
        if(Integer.parseInt(result1)>Integer.parseInt(result2)){
            answer=Integer.parseInt(result1);
        }else if(Integer.parseInt(result1)<Integer.parseInt(result2)){
            answer=Integer.parseInt(result2);
        }else{
            answer=Integer.parseInt(result1);
        }
        return answer;
    }
}
