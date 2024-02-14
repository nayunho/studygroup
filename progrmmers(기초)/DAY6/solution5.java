package DAY6;


/* 수열과 구간 쿼리 2 */
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List answer = new ArrayList();
        
        /* 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 
		가장 작은 arr[i]를 찾습니다. */
        /* 이차원배열의 접근하기위해 for문 사용 */
        for(int i=0;i<queries.length;i++){
        	/* 변수에 배열에서 나올수 있는 최대 원소 값을 저장 */
            int result1=1000000;
            for(int j=queries[i][0];j<=queries[i][1];j++){
            	/* 해당 변수가 해당 값보다 클경우 판단 */
                if(arr[j]>queries[i][2]){
                	/* 조건이 맞다면 맞은 조건의 값들중 작은 값을 선택하기위해
                	 * 계속 두개의 값을 비교해서 작은값을 선별 */
                    if(result1>=arr[j]){
                        result1=arr[j];
                    }
                }
            }
            /* 변수의 값이 변경없이 그대로라면 특정쿼리의 답이 존재하지 않으므로
             * -1을 저장하게됨 */
            if(result1==1000000){
                answer.add(-1);
            }else{
                answer.add(result1);
            }
        }
        
        int[] array = new int[(int)answer.size()];
        for(int k=0;k<answer.size();k++){
            array[k]=(int)answer.get(k);
        }
        return array;
    }
}