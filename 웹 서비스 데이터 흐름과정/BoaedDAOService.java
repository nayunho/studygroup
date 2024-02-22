package com.lec.board;

import java.util.ArrayList;

public interface BoaedDAOService {

	void createBoard();	//1.글쓰기
	
	
	
	ArrayList<BoardVO> ListBoard();		//2.글목록
	BoardVO viewBoard(int bno);			//3.글조회
	void updateBoard(int bno);			//4.글수정
	void deleteBoard(int bno);			//5.글삭제
	ArrayList<BoardVO> findBySubjectBoard(String subject);	//6.글검색 by 제목
	ArrayList<BoardVO> findByWirterBoard(String wirter);	//7.글검색 by 작성자
	
}
