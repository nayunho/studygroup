<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
JSP 문제입니다!

1. JSP로 "Hello, World!" 출력하기


2. JSP에서 아래의 변수를 만들어서 사용하기
   String name = "John"
   출력문 >> Hello, John!
	("Hello,"는 html로 출력할 것)


3. 아래의 조건문을 JSP에서 사용하기
   weather = True or False
   if(weather) {
       print("우산을 가져가라")
   } else {
       print("우산을 가져가지마라")
   }


4. JSP에서 반복문(for 또는 while) 사용하기
   for(int i=1; i<=5; i++) {
       print(i)
   }
   출력문 >> · item 1
	          · item 2
            · item 3
            · item 4
            · item 5
            ("· item"은 html을 이용하여 출력할 것)


5. JSP에서 아래의 배열  선언 후 for문으로 출력하기
   String[] fruits = {"Apple", "Banana", "Orange"}
   출력문 >> · Apple
            · Banana
            · Orange


6. JSP에서 아래의 함수(메소드) 정의하고 호출하기
   int add(int a, int b) {
           return a + b;
       }
   출력문 >> Result : 8
                ("Result"는 html을 이용하여 출력할 것) 


7. JSP에서 HTML 폼(form) 사용하기
  이름, 주소, 취미를 입력 받고

  이름 : name
  주소 : addr
  취미 : hobbies

  를 출력하기


8. JSP에서 예외 처리하기
    int result = 5 / 0를 try catch문을 사용하여 예외 처리하기
    출력문 >> 오류 발생 : / by zero
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1번</h1>
	<h3>Hello, world!</h3>
	<hr/>
	
	<h1>2번</h1>
	<% String name = "John"; %>
	<h3>Hello, <%= name %>!</h3>
	<hr/>
	
	<h1>3번</h1>
	<% 
	   boolean weather = true;
	   if(weather) {
	       out.println("우산을 가져가라");
	   } else {
		   out.println("우산을 가져가지마라");
	   }
	%>
	<hr/>
	
	<h1>4번</h1>
	<% 
	for(int i=1; i<=5; i++) {
	%>
	<ul>
		<li>
			item <%= i %>
		</li>
	</ul>	
	<%
	   }
	%>
	<hr/>
	
	<h1>5번</h1>
	<% 
	for(int i=1; i<=5; i++) {
	%>
	<ul>
		<li>
			item <%= i %>
		</li>
	</ul>	
	<%
	   }
	%>
	<hr/>
	
	<h1>6번</h1>
	<%! 
		public int add(int a, int b) {
        	return a + b;
    	}
	%>
	<h3>Result : <%= add(4,4) %></h3>
	<hr/>
	
	<h1>7번</h1>
	<form action="./request.jsp" method="get">
		이름 : <input type="text" name="name"/><br>
		주소 : <input type="text" name="addr"/><br>
		취미 : <input type="text" name="hobbie"/><br>
		<input type="submit" value="완료">
	</form>
	<br>
	
	<!-- ./request파일
	<body>
		< %
		  	String name=request.getParameter("name");
			String addr=request.getParameter("addr");
			String hobbie=request.getParameter("hobbie");
		% >
		<h3>이름 : < %= name %></h3>
		<h3>주소 : < %= addr %></h3>
		<h3>취미 : < %= hobbie %></h3>
	</body>
	 -->
	 
	<h1>8번</h1>
	<%
	try{
		int result = 5 / 0;
	}catch(Exception e){
	%>
		<h3>오류발생 : <%= e.getMessage() %></h3>
	<%	
	}
	%>
	<br>
</body>
</html>

