package com.lec.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class BoardDAOImpl implements BoaedDAOService{

	private BoardVO inputBoard() {
		
		BoardVO board = new BoardVO();
		
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요!");
		String wirter=JOptionPane.showInputDialog("작성자를 입력하세요!");
		String content=JOptionPane.showInputDialog("글내용을 입력하세요!");
		
		board.setSubject(subject);
		board.setWriter(wirter);
		board.setContent(content);
		
		return board;
	}
	
	@Override
	public void createBoard() {
		BoardVO board=inputBoard();
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt =null;
		String sql=cf.getInsert();
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,board.getSubject());
			pstmt.setString(2,board.getWriter());
			pstmt.setString(3,board.getContent());
			int row =pstmt.executeUpdate();
			System.out.println(board.getSubject());
			System.out.println(row+"건이 성공적으로 등록 되었습니다.");
		}catch(Exception e) {
			System.out.println(board.getWriter());
		}finally {
			
		}
	}

	@Override
	public ArrayList<BoardVO> ListBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO viewBoard(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(int bno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int bno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BoardVO> findBySubjectBoard(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BoardVO> findByWirterBoard(String wirter) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
