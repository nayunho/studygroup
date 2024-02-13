package DAY5;


/* 원소들의 곱과 합 */
class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;
        int result1=1;
        int result2=0;
        /* for문을 이용해서 두개의 배열의 제곱의 합을 구함 Math.pow()를 아용해서 제곱을 구할 수 있다. */
        for(int i=0;i<num_list.length;i++){
            result1=result1*num_list[i];
            result2=result2+num_list[i];
        }
        result2=result2*result2;
        if(result1<result2){
            answer=1;
        }else{
             answer=0;
        }
        return answer;
    }
}
