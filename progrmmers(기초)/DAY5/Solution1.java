package DAY5;

	class Solution1 {
		/* 코드 처리하기 */
	    public String solution(String code) {
	        String answer = "";
	        int mode=0;
	        /* for문으로 해당 문자열 길이 만큼 반복 진행 */
	        for(int i=0;i<code.length();i++){
	            char ch = code.charAt(i);
	            /* if문으로 mode가 1일떄랑 0일때 판단 */
	            if(mode==0){
	                if(ch=='1'){
	                     mode=1;
	                }else if(i%2==0){
	                    answer=answer+ch;
	                }
	            }else if(mode==1){
	                if(ch =='1'){
	                     mode=0;
	                }else if(i%2!=0){
	                    answer=answer+ch;
	                }
	            }
	        }
	        if(answer.isEmpty()){
	            answer="EMPTY";
	        }
	        return answer;
	    }
	}

