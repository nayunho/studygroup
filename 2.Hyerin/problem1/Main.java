package test;

import java.util.ArrayList;
import java.util.List;

/* 5글자이상 단어만 고르는건 향상된 for문 사용하시거나 일반 for문 사용하시려면 wordList List로 조건식 주시면 됩니다아*/
/*1. 출력문처럼 words 배열에서 단어의 길이가 5이상인 단어들만 보여주도록 해주세요!!
2. 메서드 완성 후 에러가 발생하는 요소도 찾아서 해결해 주세요!! 
(에러는 메서드 return 과 반복문을 보시면 쉽게 발견할 수 있습니다.)

=======================================
<출력문>
5글자 이상인 단어들 :
banana
orange
strawberry
========================================
*/
public class Main {
    public static void main(String[] args) {
    	String[] words = {"leaf", "banana", "orange", "strawberry", "pear", "cat"};
        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i <= words.length; i++) {
            wordsList.add(words[i]);
        }

        //메서드 호출 및 출력문
        List<String> filteredWords = Main.getFilteredWords(wordsList);
		
	 System.out.println("5글자 이상인 단어들의 리스트:");

	//메서드로 필터링한 글자들을 for문을 통해 프린트
	 for (String word : filteredWords) {
	       System.out.println(word);
	 }
    }//main메소드 끝


    public static List<String> getFilteredWords(List<String> wordsList) {
        
	List<String> filteredWords = new ArrayList<>();
        //1. 여기에 5글자 이상인 단어들만 filteredWords 리스트에 추가하도록 구현()
        








  
        return null;
    }
}
