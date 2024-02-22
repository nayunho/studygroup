package com.lec.board;

public class BoardMain {

   
   /*
    * 게시판 APlication
    *          CREATE TABLE BOARD (
           bno  int NOT NULL AUTO_INCREMENT COMMENT '글번호',
           subject varchar(100) NOT NULL COMMENT '글제목',
           writer  varchar(50) NOT NULL COMMENT '작성자',
           content varchar(255) DEFAULT NULL COMMENT '본문글',
           crtdate date DEFAULT (now()) COMMENT '작성일',
           readcnt int DEFAULT NULL COMMENT '조회수',
           PRIMARY KEY (`bno`)
         );
        2) db접속 방법
        	JDBC_application.properties
        3) board aplpication
        	1)BoardMain		:게시판 메인클래스  
        	2)BoardVO		:게시판 Modle 클래스(DTO)
        	3)ConnectionFactory	:DB접속정보를 공통으로 사용하기 위한 클래스(Factory Pattern)
        	4)BoaedDAOService	: 게시판 Interface클래스(DAO - Interface)
        	5)BoardDAOImpl		: 게시판 구현 클래스(DAO)
        	6)BoardFactory		: 게시판 생성 클래스(Singleton Pattern)
        	7)BoardMenu			: 게시판 메인메뉴 클래스
    * */
   public static void main(String[] args) {
      
     	BoardMenu menu = new BoardMenu(1.0);
     	menu.mainBoardMenu();
	   
     	ConnectionFactory cf = new ConnectionFactory();
     	System.out.println(cf.getConnection());
     
     	BoardDAOImpl bf1 = BoardFactory.getInstance();
     	BoardDAOImpl bf2 = BoardFactory.getInstance();
	   
     	System.out.println(bf1);
     	System.out.println(bf2);
   }

}