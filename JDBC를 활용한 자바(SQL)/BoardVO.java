package com.lec.board;

public class BoardVO {

	private int bno;
	private String subject;
	private String writer;
	private String content;
	private int readcnt;
	private String ctdate;

	public BoardVO() {
		
		this.bno=0;
		this.subject=null;
		this.writer=null;
		this.content=null;
		this.readcnt=0;
		this.ctdate=null;
	}
	
	public int getBno() {
		return bno;
	}



	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}


	public String getCtdate() {
		return ctdate;
	}

	public void setCtdate(String ctdate) {
		this.ctdate = ctdate;
	}

	@Override
	public String toString() {
		return this.bno+"\t\t" + this.subject + "\t\t"+this.writer +"\t\t" + this.content;
	}


	
	
}
