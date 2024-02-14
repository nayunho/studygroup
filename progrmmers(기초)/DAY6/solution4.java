package DAY6;

/* 수열과 구간 쿼리 3 */
class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int a;
        int b;
        int temp;
        /* query를 나타내며, [i, j] 꼴이다.
		각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다. */
        /* temp라는 임시 변수를 이용해서 두개의 배열값을 변경한다. */
        for(int i=0;i<queries.length;i++){
            a=queries[i][0];
            b=queries[i][1];
            temp=answer[a];
            answer[a]=answer[b];
            answer[b]=temp;
        }
        return answer;
    }
}