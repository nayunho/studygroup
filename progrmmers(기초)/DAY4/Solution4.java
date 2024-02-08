package progremmers;

class Solution4 {
	/* 조건 문자열 */
	public int solution(String ineq, String eq, int n, int m) {
        boolean answer=true;
        int result=0;
        /* if문을 이용해 해당문자가 >,=,<,!를 equals로 판단 연산 수행 */
        if(ineq.equals(">") && eq.equals("=")){
            answer=(n>=m);
        }else if(ineq.equals(">") && eq.equals("!")){
            answer=(n>m);
        }else if(ineq.equals("<") && eq.equals("=")){
            answer=(n<=m);
        }else if(ineq.equals("<") && eq.equals("!")){
            answer= (n<m);
        }
        
        if(answer){
            result=1;
        }else{
            result=0;
        }
        return result;
    }
}