package Day3;

class Solution2 {
	/* arr의 원소들을 순서대로 이어 붙인 문자열을 return  */
    public String solution(String[] arr) {
        String answer = "";
        /* 반복문을 이용해 각 배열의 원소를 찾아 answer에 넣어준다.*/
        for(int i=0;i<arr.length;i++){
         answer+=arr[i];   
        }
        return answer;
    }
}
