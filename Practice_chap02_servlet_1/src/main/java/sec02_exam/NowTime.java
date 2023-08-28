package sec02_exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿은 jsp 이전에 나온 동적 웹개발 방식으로써, 바꿀 때마다 서버 재시작해야함
 * 매핑으로는 @WebServlet 어노테이션을 통한 매핑과,
 * web.xml을 통한 매핑 방법이 있다.
 * 실행은 포트번호/프로젝트이름/매핑이름의 형태로 실행 (톰캣 키고)*/

@WebServlet("/NowTime")
public class NowTime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>현재시간</title>");
		out.println("<body>");
		out.println("지금 시간은:");
		out.println(new Date());
		out.println("입니다.");
		out.println("</body>");
		out.println("</head>");
		out.println("</HTML>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
