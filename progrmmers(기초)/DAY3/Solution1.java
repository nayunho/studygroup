package Day3;

class Solution1 {
    /* str1과 str2문자열 서로 번갈아가면서 출력*/
	public String solution(String str1, String str2) {
        String answer = "";
        /* 각 문자열마다 charAt함수를 이용해 문자를 빼놓는다. */
        for(int i=0;i<str1.length();i++){
        	/* char문자열을 String 타입으로 바꾸기위해 ""빈 문자를 더해준다. */
            String result = str1.charAt(i)+""+str2.charAt(i);
            answer+=result;
        }
        return answer;
    }
}
