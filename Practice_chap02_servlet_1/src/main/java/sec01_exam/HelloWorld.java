package sec01_exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 javax.servlet 패키지 예외 발생 시 build path에서 external jar를 추가해야함
 톰캣 서버와의 연동에서 문제가 생기는 것 이므로 톰캣을 설치하면서 받는 lib의 servlet api와 
 jsp api를 추가한다.
 
 */


@WebServlet("/Hworld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloWorld() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World123");
	}

}
