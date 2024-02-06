package Day3;

class Solution3 {
	/* my_string을 k번 반복한 문자열을 return */
    public String solution(String my_string, int k) {
        String answer = "";
        /* 반복문을 이용하여 해다 문자열을 더해준다. */
        for(int i=0;i<k;i++){
            answer=answer+my_string;
        }
        return answer;
    }
}
