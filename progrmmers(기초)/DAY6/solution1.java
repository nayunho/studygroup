package DAY6;

/* 마지막 두 원소 */
class Solution1 {
    public int[] solution(int[] num_list) {
        int len=num_list.length;
        int[] answer = new int[len+1];
        int result=0;
        
        /* len은 해당 배열의 길이를 나타냄 그래서 마지막 원소와 그전 원소와 비교 */
        if(num_list[len-1]>num_list[len-2]){
            result=num_list[len-1]-num_list[len-2];
        }else if(num_list[len-1]<=num_list[len-2]){
            result=num_list[len-1]*2;
        }
        /* for문을 이용하여 answer배열에 저장 */
        for(int i=0;i<len;i++){
            answer[i]=num_list[i];
        }
        answer[len]=result;
        return answer;
    }
}
